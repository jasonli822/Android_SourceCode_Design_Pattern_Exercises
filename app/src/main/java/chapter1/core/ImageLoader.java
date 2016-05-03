package chapter1.core;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import chapter1.cache.DoubleCache;
import chapter1.cache.ImageCache;
import chapter1.cache.MemoryCache;
import chapter1.config.ImageLoaderConfig;

/**
 * Created by jasonli822 on 2016/4/25.
 * 图片加载类
 */
public class ImageLoader {
    // 图片加载配置对象
    private ImageLoaderConfig mConfig;

    // 图片缓存对象
    private ImageCache mImageCache = new MemoryCache();

    // ImageLoader实例
    private static ImageLoader sInstance;

    // 线程池，线程数量为CPU的数量
    ExecutorService mExecutorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    // 私有化构造函数
    private ImageLoader() {
    }

    /**
     * 获取ImageLoader单例，DCL形式
     * @return
     */
    public static ImageLoader getInstance() {
        if (sInstance == null) {
            synchronized (ImageLoader.class) {
                if (sInstance == null) {
                    sInstance = new ImageLoader();
                }
            }
        }
        return sInstance;
    }

    public void init(ImageLoaderConfig config) {
        mConfig = config;
        mImageCache = config.getImageCache();
        mExecutorService = Executors.newFixedThreadPool(config.getThreadCount());
    }

    // 加载图片
    public void displayImage(final String imageUrl, final ImageView imageView) {
        Bitmap bitmap = mImageCache.get(imageUrl);
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
            return;
        }

        // 图片没有缓存，提交到线程池中下载图片
        submitLoadRequest(imageUrl, imageView);
    }

    private void submitLoadRequest(final String imageUrl, final ImageView imageView) {
        // 设置加载中的图片
        imageView.setImageResource(mConfig.getDisplayConfig().loadingResId);

        imageView.setTag(imageUrl);
        mExecutorService.submit(new Runnable() {
            @Override
            public void run() {
                Bitmap bitmap = downloadImage(imageUrl);
                if (bitmap == null) {
                    // 设置加载图片失败后显示的图片
                    imageView.setImageResource(mConfig.getDisplayConfig().failedResId);
                    return;
                }
                if (imageView.getTag().equals(imageUrl)) {
                    imageView.setImageBitmap(bitmap);
                }
                mImageCache.put(imageUrl, bitmap);
            }
        });
    }

    // 图片下载
    public Bitmap downloadImage(String imageUrl) {
        Bitmap bitmap = null;
        try {
            URL url = new URL(imageUrl);
            final HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            bitmap = BitmapFactory.decodeStream(conn.getInputStream());
            conn.disconnect();
        } catch(Exception e) {
            e.printStackTrace();
        }
        return bitmap;
    }

    public static void main(String[] args) {
        // ImageLoader初始化示例

        ImageLoaderConfig config = new ImageLoaderConfig.Builder()
                .setLoadingPlaceHolder(android.R.drawable.btn_default)
                .setNotFoundPlaceholder(android.R.drawable.btn_default)
                .setCache(new DoubleCache())
                .setThreadCount(4).create();

        // 将配置初始化到ImageLoader中
        ImageLoader.getInstance().init(config);
    }
}

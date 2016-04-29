package chapter1;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.util.LruCache;
import android.widget.ImageView;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by jasonli822 on 2016/4/25.
 * 图片加载类
 * 原始需求：主管的要求很简单，要小民实现图片加载，并且要讲图片缓存起来。
 */
public class ImageLoader {
    // 图片缓存
    ImageCache mImageCache = new ImageCache();
    // SD卡缓存
    DiskCache mDiskCache = new DiskCache();
    // 是否使用SD卡缓存
    boolean isUseDiskCache = false;
    // 线程池，线程数量为CPU的数量
    ExecutorService mExecutorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());

    // 加载图片
    public void displayImage(final String url, final ImageView imageView) {
        // 判断使用哪种缓存
        Bitmap bitmap = isUseDiskCache ? mDiskCache.get(url) : mImageCache.get(url);
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
            return;
        }
        // 没有缓存，则交给线程池进行下载
        imageView.setTag(url);
        mExecutorService.submit(new Runnable() {
            @Override
            public void run() {
                Bitmap bitmap = downloadImage(url);
                if (bitmap == null) {
                   return;
                }
                if (imageView.getTag().equals(url)) {
                    imageView.setImageBitmap(bitmap);
                }
                mImageCache.put(url, bitmap);
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
}

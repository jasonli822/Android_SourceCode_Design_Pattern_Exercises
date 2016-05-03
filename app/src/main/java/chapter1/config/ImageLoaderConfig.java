package chapter1.config;

import android.os.Build;

import chapter1.cache.ImageCache;
import chapter1.cache.MemoryCache;

/**
 * Created by jasonli822 on 2016/5/3.
 * 通过将ImageLoaderConfig的构造函数、字段私有化，使得外部不能访问内部属性，用户唯一能够设置属性的地方就是通过
 * Builder对象了，也就是说只能通过Builder对象来构建ImagLoaderConfig对象，这就是构建和表示相分离
 */
public class ImageLoaderConfig {
    // 图片缓存配置对象
    ImageCache imageCache = new MemoryCache();
    // 加载图片时的loading和加载失败的图片配置对象
    DisplayConfig displayConfig = new DisplayConfig();
    // 线程数量，默认是CPU数量+1
    int threadCount = Runtime.getRuntime().availableProcessors() + 1;

    private ImageLoaderConfig() {
    }

    public ImageCache getImageCache() {
        return imageCache;
    }

    public DisplayConfig getDisplayConfig() {
        return displayConfig;
    }

    public int getThreadCount() {
        return threadCount;
    }

    /**
     * 配置类Builder (内部类)
     */
    public static class Builder {
        // 图片缓存配置对象
        ImageCache imageCache = new MemoryCache();
        // 加载图片时的loading和加载失败的图片配置对象
        DisplayConfig displayConfig = new DisplayConfig();
        // 线程数量，默认是CPU数量+1
        int threadCount = Runtime.getRuntime().availableProcessors() + 1;

        // 设置线程数量
        public Builder setThreadCount(int count) {
            threadCount = Math.max(1, count);
            return this;
        }

        // 设置缓存
        public Builder setCache(ImageCache cache) {
            imageCache = cache;
            return this;
        }

        // 设置图片加载中显示的图片
        public Builder setLoadingPlaceHolder(int resId) {
            displayConfig.loadingResId = resId;
            return this;
        }

        // 设置要加载的图片加载失败时显示的图片
        public Builder setNotFoundPlaceholder(int resId) {
            displayConfig.failedResId = resId;
            return this;
        }

        void applyConfig(ImageLoaderConfig config) {
            config.imageCache = this.imageCache;
            config.displayConfig = this.displayConfig;
            config.threadCount = this.threadCount;
        }

        public ImageLoaderConfig create() {
            ImageLoaderConfig config = new ImageLoaderConfig();
            // 应用配置
            applyConfig(config);
            return config;
        }
    }
}

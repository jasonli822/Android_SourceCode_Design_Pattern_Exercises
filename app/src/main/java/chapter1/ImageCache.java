package chapter1;

import android.graphics.Bitmap;
import android.util.LruCache;

/**
 * Created by jasonli822 on 2016/4/28.
 */
public interface ImageCache {
    public Bitmap get(String url);
    public void put(String url, Bitmap bitmap);
}

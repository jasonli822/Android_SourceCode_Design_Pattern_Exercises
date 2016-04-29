package chapter1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by jasonli822 on 2016/4/28.
 */
public class DiskCache implements ImageCache {
    static String cacheDir = "sdcard/cache/";

    // 从SD卡缓存中获取图片
    public Bitmap get(String url) {
        return BitmapFactory.decodeFile(cacheDir + url);
    }

    public void put(String url, Bitmap bmp) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(cacheDir + url);
            bmp.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            CloseUtils.closeQuietly(fileOutputStream);
        }
    }
}

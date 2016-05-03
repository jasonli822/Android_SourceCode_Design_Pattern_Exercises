package chapter1.util;

import java.io.Closeable;
import java.io.IOException;

/**
 * Created by jasonli822 on 2016/4/29.
 */
public final class CloseUtils {
    private CloseUtils() {}

    /**
     * 关闭Closeable对象
     * @param closeable
     */
    public static void closeQuietly(Closeable closeable) {
        if (null != closeable) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

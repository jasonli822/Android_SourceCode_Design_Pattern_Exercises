package chapter2;

/**
 * Created by jasonli822 on 2016/5/3.
 * Double Check Lock (DCL)实现单例
 */
public class Singleton2 {
    private static Singleton2 mInstance = null;

    private Singleton2() {
    }

    public static Singleton2 getsInstance() {
        if (mInstance == null) {
            synchronized (Singleton2.class) {
                if (mInstance == null) {
                    mInstance = new Singleton2();
                }
            }
        }
        return mInstance;
    }
}

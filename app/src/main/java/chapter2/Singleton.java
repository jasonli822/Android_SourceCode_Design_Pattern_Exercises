package chapter2;

import java.io.ObjectStreamException;

/**
 * Created by jasonli822 on 2016/4/29.
 * 静态内部类单例模式
 * 当第一次加载Singleton类时并不会初始化sInstance,只有在第一次调用Singleton的getInstance方法时才会导致sInstance被初始化。
 * 因此，第一次调用getInstance方法会导致虚拟机加载SingletonHolder类，这种方式不仅能够确保线程安全，也能够保证单例对象的唯一性，
 * 同时也延迟了单例的实例化，所以这是推荐使用的单例模式实现方式。
 */
public class Singleton {
    private Singleton() {}

    public static Singleton getInstance() {
        return SingletonHolder.sInstance;
    }

    /**
     * 静态内部类
     */
    private static class SingletonHolder {
        private static final Singleton sInstance = new Singleton();
    }

    /**
     * 杜绝单例对象在被反序列化时重新生成对象
     * @return
     * @throws ObjectStreamException
     */
    private Object readResolve() throws ObjectStreamException {
        return getInstance();
    }
}

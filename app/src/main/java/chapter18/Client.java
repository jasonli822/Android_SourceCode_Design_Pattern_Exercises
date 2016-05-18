package chapter18;

/**
 * Created by jasonli822 on 2016/5/17.
 * 客户类
 */
public class Client {
    public static void main(String[] args) {
        // 构建一个真实主题对象
        RealSubject realSubject = new RealSubject();

        // 通过真实主题对象构建一个代理对象
        ProxySubject proxy = new ProxySubject(realSubject);

        // 调用代理的相关方法
        proxy.visit();
    }
}

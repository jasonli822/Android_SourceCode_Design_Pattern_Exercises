package chapter5;

/**
 * Created by jasonli822 on 2016/5/5.
 * 测试类
 */
public class Client {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactoryA();
        Product product = factory.createProduct();
        product.method();
    }
}

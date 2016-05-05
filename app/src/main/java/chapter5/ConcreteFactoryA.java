package chapter5;

/**
 * Created by jasonli822 on 2016/5/5.
 * 具体的共产类
 */
public class ConcreteFactoryA extends Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}

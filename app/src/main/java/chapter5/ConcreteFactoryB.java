package chapter5;

/**
 * Created by jasonli822 on 2016/5/5.
 */
public class ConcreteFactoryB extends Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}

package chapter6;

/**
 * Created by jasonli822 on 2016/5/6.
 * 具体工厂类2
 */
public class ConcreteFactory2 extends AbstractFactory {
    @Override
    public AbstractProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ConcreteProductB2();
    }
}

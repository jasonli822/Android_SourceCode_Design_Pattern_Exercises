package chapter21;

/**
 * Created by jasonli822 on 2016/5/19.
 * 具体装饰者B
 */
public class ConcreteDecoratorB extends Decorator {
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    /**
     * 自定义装饰方法A
     */
    public void operateA() {
        // 装饰方法逻辑
    }

    /**
     * 自定义装饰方法B
     */
    public void operateB() {
        // 装饰方法逻辑
    }

    @Override
    public void operate() {
        operateA();

        super.operate();

        operateB();
    }
}

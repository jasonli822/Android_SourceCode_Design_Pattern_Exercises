package chapter21;

/**
 * Created by jasonli822 on 2016/5/19.
 */
public class Client {
    public static void main(String[] args) {
        // 构建被装饰的组件对象
        Component component = new ConcreteComponent();

        // 根据组件对象构造装饰者对象A并调用，此时相当于给组件对象增加装饰者A的功能方法
        Decorator decoratorA = new ConcreteDecoratorA(component);
        decoratorA.operate();

        // 根据组件对象构造装饰者对象B并调用，此时相当于给组件对象增加装饰者B的功能方法
        Decorator decoratorB = new ConcreteDecoratorB(component);
        decoratorB.operate();
    }
}

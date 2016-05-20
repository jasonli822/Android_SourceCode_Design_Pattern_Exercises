package chapter24.sample2;

/**
 * Created by jasonli822 on 2016/5/20.
 */
public class LargeCoffee extends Coffee {
    public LargeCoffee(CoffeeAdditives impl) {
        super(impl);
    }

    @Override
    public void makeCoffee() {
        System.out.println("大杯的" + impl.addSomething() + "咖啡");
    }
}

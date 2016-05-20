package chapter24.sample2;

/**
 * Created by jasonli822 on 2016/5/20.
 */
public abstract class Coffee {
    protected CoffeeAdditives impl;

    public Coffee(CoffeeAdditives impl) {
        this.impl = impl;
    }

    /**
     * 咖啡具体是什么样子的，由子类决定
     */
    public abstract void makeCoffee();
}

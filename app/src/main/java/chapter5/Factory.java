package chapter5;

/**
 * Created by jasonli822 on 2016/5/5.
 * 抽象工厂类
 */
public abstract class Factory {
    /**
     * 抽象工厂方法
     * 具体产生什么由子类去实现
     * @return 具体的产品对象
     */
    public abstract Product createProduct();
}


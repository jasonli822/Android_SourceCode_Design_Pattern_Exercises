package chapter24.sample2;

/**
 * Created by jasonli822 on 2016/5/20.
 */
public class Client {
    public static void main(String[] args) {
        // 原汁原味
        Ordinary implOrdinary = new Ordinary();

        // 准备糖类
        Sugar implSugar = new Sugar();

        // 大杯咖啡 原味
        LargeCoffee largeCoffee = new LargeCoffee(implOrdinary);
        largeCoffee.makeCoffee();

        // 小杯咖啡 原味
        SmallCoffee smallCoffee = new SmallCoffee(implOrdinary);
        smallCoffee.makeCoffee();

        // 大杯咖啡 加糖
        LargeCoffee largeCoffeeSugar = new LargeCoffee(implSugar);
        largeCoffeeSugar.makeCoffee();

        // 小杯咖啡  加糖
        SmallCoffee smallCoffeeSugar = new SmallCoffee(implSugar);
        smallCoffeeSugar.makeCoffee();
    }
}

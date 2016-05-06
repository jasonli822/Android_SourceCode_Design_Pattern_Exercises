package chapter7;

/**
 * Created by jasonli822 on 2016/5/6.
 * 交通出行价格计算器
 */
public class TrafficCalculator {
    private CalculateStrategy strategy;

    public void setStrategy(CalculateStrategy strategy) {
        this.strategy = strategy;
    }

    public int calculatePrice(int km) {
        return strategy.calculatePrice(km);
    }

    public static void main(String[] args) {
        TrafficCalculator calculator = new TrafficCalculator();
        calculator.setStrategy(new BusStrategy());
        System.out.println("公交车乘16公里的价格：" + calculator.calculatePrice(16));
    }
}

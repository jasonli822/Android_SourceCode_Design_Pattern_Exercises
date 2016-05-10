package chapter9.sample2;

/**
 * Created by jasonli822 on 2016/5/10.
 */
public class Manager extends Leader {
    @Override
    public int limit() {
        return 10000;
    }

    @Override
    public void handle(int money) {
        System.out.println("经理批复报销" + money + "元");
    }
}

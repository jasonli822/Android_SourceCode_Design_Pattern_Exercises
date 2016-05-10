package chapter9.sample2;

/**
 * Created by jasonli822 on 2016/5/10.
 */
public class Boss extends Leader {
    @Override
    public int limit() {
        return Integer.MAX_VALUE;
    }

    @Override
    public void handle(int money) {
        System.out.println("老板批复报销" + money + "元");
    }
}

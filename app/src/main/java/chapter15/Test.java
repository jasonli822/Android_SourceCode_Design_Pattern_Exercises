package chapter15;

/**
 * Created by jasonli822 on 2016/5/16.
 */
public class Test {
    public static void main(String[] args) {
        AbstractComputer comp = new CoderComputer();
        comp.startUp();

        comp = new MilitaryComputer();
        comp.startUp();
    }
}

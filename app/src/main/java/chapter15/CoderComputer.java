package chapter15;

/**
 * Created by jasonli822 on 2016/5/16.
 * 程序员的计算机
 */
public class CoderComputer extends AbstractComputer {
    @Override
    protected void login() {
        System.out.println("程序员只需要进行用户名和密码验证就可以了");
    }
}

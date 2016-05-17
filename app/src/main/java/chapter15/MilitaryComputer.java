package chapter15;

/**
 * Created by jasonli822 on 2016/5/16.
 * 军用计算机
 */
public class MilitaryComputer extends AbstractComputer {
    @Override
    protected void checkHardware() {
        System.out.println("检查硬件防火墙");
    }

    @Override
    protected void login() {
        System.out.println("进行指纹识别等复杂的用户验证");
    }
}

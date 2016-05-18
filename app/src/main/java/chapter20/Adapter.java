package chapter20;

/**
 * Created by jasonli822 on 2016/5/18.
 * Adapter角色，将220V电压转换为5V电压
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public int getVolt5() {
        return 5;
    }
}

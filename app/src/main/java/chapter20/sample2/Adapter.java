package chapter20.sample2;

/**
 * Created by jasonli822 on 2016/5/18.
 */
public class Adapter implements Target {
    Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public int getVolt220() {
        return adaptee.getVolt220();
    }

    @Override
    public int getVolt5() {
        return 5;
    }
}

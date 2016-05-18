package chapter20.sample2;

/**
 * Created by jasonli822 on 2016/5/18.
 */
public class Test {
    public static void main(String[] args) {
        Adapter adapter = new Adapter(new Adaptee());
        System.out.println("输出电压：" + adapter.getVolt5());
    }
}

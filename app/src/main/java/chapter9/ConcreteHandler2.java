package chapter9;

/**
 * Created by jasonli822 on 2016/5/9.
 * 具体的处理者2
 */
public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(String condition) {
        if (condition.equals("ConcreteHandler2")) {
            System.out.println("ConcreteHandler2 handled");
            return;
        } else {
            successor.handleRequest(condition);
        }
    }
}

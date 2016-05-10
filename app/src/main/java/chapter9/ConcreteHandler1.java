package chapter9;

/**
 * Created by jasonli822 on 2016/5/9.
 * 具体的处理者1
 */
public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(String condition) {
        if (condition.equals("ConcreteHandler1")) {
            System.out.println("ConcreteHandler1 handled");
            return;
        } else {
            successor.handleRequest(condition);
        }
    }
}

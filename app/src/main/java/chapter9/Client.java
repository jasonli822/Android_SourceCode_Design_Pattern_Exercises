package chapter9;

/**
 * Created by jasonli822 on 2016/5/9.
 */
public class Client  {
    public static void main(String[] args) {
        // 构建一个ConcreteHandler1对象
        ConcreteHandler1 handler1 = new ConcreteHandler1();

        // 构建一个ConcreteHandler2对象
        ConcreteHandler2 handler2 = new ConcreteHandler2();

        // 设置handler1的下一个节点
        handler1.successor = handler2;
        // 设置handler2的下一个节点
        handler2.successor = handler1;

        // 处理请求
        handler1.handleRequest("ConcreteHandler2");
    }
}

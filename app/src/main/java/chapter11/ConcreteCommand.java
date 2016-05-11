package chapter11;

/**
 * Created by jasonli822 on 2016/5/11.
 * 具体命令类
 */
public class ConcreteCommand implements Command {
    private Receiver receiver; // 持有一个对接收者对象的引用

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        // 调用接收者的相关方法来执行具体逻辑
        receiver.action();
    }
}

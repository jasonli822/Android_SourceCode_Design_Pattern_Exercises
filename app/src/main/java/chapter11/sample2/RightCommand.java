package chapter11.sample2;

/**
 * Created by jasonli822 on 2016/5/11.
 * 具体命令类 向右移的命令类
 */
public class RightCommand implements Command {
    // 持有一个接收者俄罗斯方块游戏对象的引用
    private TetrisMachine machine;

    public RightCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {
        // 调用游戏机里面具体方法执行操作
        machine.toRight();
    }
}

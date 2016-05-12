package chapter11.sample2;

/**
 * Created by jasonli822 on 2016/5/11.
 * 具体命令者 向左移的命令类
 */
public class LeftCommand implements Command {
    // 持有一个接收俄罗斯方块游戏对象的引用
    private TetrisMachine machine;

    public LeftCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {
        // 调用游戏机里的具体方法执行操作
        machine.toLeft();
    }
}

package chapter11.sample2;

/**
 * Created by jasonli822 on 2016/5/11.
 * 具体命令者 快速落下的命令类
 */
public class FallCommand implements Command {
    // 持有一个接俄罗斯方块游戏对象的引用
    private TetrisMachine machine;

    public FallCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {
        // 调用游戏里具体的方法执行操作
        machine.fastToBottom();
    }
}

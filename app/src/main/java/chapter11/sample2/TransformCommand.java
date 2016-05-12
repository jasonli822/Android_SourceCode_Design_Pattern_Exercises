package chapter11.sample2;

/**
 * Created by jasonli822 on 2016/5/12.
 * 具体命令者 变化方块形状的命令类
 */
public class TransformCommand implements Command {
    // 持有一个接收者俄罗斯方块游戏对象的引用
    private TetrisMachine machine;

    public TransformCommand(TetrisMachine machine) {
        this.machine = machine;
    }

    @Override
    public void execute() {
        // 调用游戏机里具体方法执行操作
        machine.transform();
    }
}

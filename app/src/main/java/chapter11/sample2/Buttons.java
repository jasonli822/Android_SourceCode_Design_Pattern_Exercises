package chapter11.sample2;

/**
 * Created by jasonli822 on 2016/5/12.
 * 请求者类 命令由按钮发起
 */
public class Buttons {
    private LeftCommand leftCommand; // 向左移动的命令对象引用
    private RightCommand rightCommand; // 向右移动的命令对象引用
    private FallCommand fallCommand; // 快速落下的命令对象引用
    private TransformCommand transformCommand; // 变换形状的命令对象引用

    public void setLeftCommand(LeftCommand leftCommand) {
        this.leftCommand = leftCommand;
    }

    public void setRightCommand(RightCommand rightCommand) {
        this.rightCommand = rightCommand;
    }

    public void setFallCommand(FallCommand fallCommand) {
        this.fallCommand = fallCommand;
    }

    public void setTransformCommand(TransformCommand transformCommand) {
        this.transformCommand = transformCommand;
    }

    /**
     * 按下按钮向左移动
     */
    public void toLeft() {
        leftCommand.execute();
    }

    /**
     * 按下按钮向右移动
     */
    public void toRight() {
        rightCommand.execute();
    }

    /**
     * 按下按钮快速落下
     */
    public void fall() {
        fallCommand.execute();
    }

    /**
     * 按下按钮改变形状
     */
    public void transform() {
        transformCommand.execute();
    }
}

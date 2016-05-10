package chapter9;

/**
 * Created by jasonli822 on 2016/5/9.
 * 抽象处理者
 */
public abstract class Handler {
    protected Handler successor; // 下一节点处理者

    /**
     * 请求处理
     * @param condition 请求条件
     */
    public abstract void handleRequest(String condition);
}

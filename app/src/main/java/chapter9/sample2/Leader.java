package chapter9.sample2;

/**
 * Created by jasonli822 on 2016/5/10.
 */
public abstract class Leader {
    protected Leader nextHandler; // 上一级的领导处理者

    /**
     * 自身能批复的额度权限
     * @return
     */
    public abstract int limit();

    /**
     * 处理报账行为
     * @param money 具体额度
     */
    public abstract void handle(int money);

    /**
     * 处理报账请求
     * @param money 能批复的报账额度
     */
    public final void handleRequest(int money) {
        if (money <= limit()) {
            handle(money);
        } else {
            if (null != nextHandler) {
                nextHandler.handleRequest(money);
            }
        }
    }
}

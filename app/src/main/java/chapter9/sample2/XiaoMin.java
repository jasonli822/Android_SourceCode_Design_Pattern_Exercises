package chapter9.sample2;

/**
 * Created by jasonli822 on 2016/5/10.
 */
public class XiaoMin {
    public static void main(String[] args) {
        // 构建各个领导对象
        GroupLeader groupLeader = new GroupLeader();
        Director director = new Director();
        Manager manager = new Manager();
        Boss boss = new Boss();

        // 设置上一级领导处理者对象
        groupLeader.nextHandler = director;
        director.nextHandler = manager;
        manager.nextHandler = boss;

        // 发起报账申请
        groupLeader.handleRequest(50000);
    }
}

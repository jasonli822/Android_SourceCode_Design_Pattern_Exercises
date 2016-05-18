package chapter18;

/**
 * Created by jasonli822 on 2016/5/17.
 * 实现抽象主题的真实主题类
 */
public class RealSubject extends Subject {
    @Override
    public void visit() {
        // RealSubject 中 visit 的具体逻辑
        System.out.println("Real Subject!");
    }
}

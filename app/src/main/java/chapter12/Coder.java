package chapter12;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by jasonli822 on 2016/5/12.
 * 程序员是观察者
 */
public class Coder implements Observer {
    public String name;
    public Coder(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable observable, Object data) {
        System.out.println("Hi, " + name + ", DevTechFrontier更新啦，内容 : " + data);
    }

    @Override
    public String toString() {
        return "码农： " + name;
    }
}

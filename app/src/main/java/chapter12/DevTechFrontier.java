package chapter12;

import java.util.Observable;

/**
 * Created by jasonli822 on 2016/5/12.
 * DevTechFrontier 即开发技术前线，这个网站是被观察者角色，当它有更新时所有的观察者(这里是程序员)都会接到相应通知
 */
public class DevTechFrontier extends Observable {
    public void postNewPublication(String content) {
        // 标识状态或者内容发生了变化
        setChanged();
        // 通知所有观察者
        notifyObservers(content);
    }
}

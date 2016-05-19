package chapter22;

import java.util.Random;

/**
 * Created by jasonli822 on 2016/5/19.
 * 具体实现类 TrainTicket
 */
public class TrainTicket implements Ticket {
    public String from; // 始发地
    public String to; // 目的地
    public String bunk; // 铺位
    public int price; // 价格

    TrainTicket(String from, String to) {
        this.from = from;
        this.to = to;
    }

    @Override
    public void showTicketInfo(String bunk) {
        price = new Random().nextInt(300);
        System.out.println("购买 从 " + from + " 到 " + to + " 的 " + bunk + " 火车票" + ",价格：" + price);
    }
}

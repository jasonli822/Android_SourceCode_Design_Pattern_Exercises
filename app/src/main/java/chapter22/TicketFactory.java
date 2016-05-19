package chapter22;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by jasonli822 on 2016/5/19.
 * 车票工厂，以出发地和目的地为key缓存车票
 */
public class TicketFactory {
    static Map<String, Ticket> sTicketMap = new ConcurrentHashMap<String, Ticket>();

    public static Ticket getTicket(String from, String to) {
        String key = from + "-" + to;
        if (sTicketMap.containsKey(key)) {
            System.out.println("使用缓存=>" + key);
            return sTicketMap.get(key);
        } else {
            System.out.println("创建对象 ==> " + key);
            Ticket ticket = new TrainTicket(from, to);
            sTicketMap.put(key, ticket);
            return ticket;
        }
    }
}

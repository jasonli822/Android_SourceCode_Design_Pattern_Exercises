package chapter14;

/**
 * Created by jasonli822 on 2016/5/16.
 * 客户类
 */
public class Client {
    public static void main(String[] args) {
        Aggregate<String> a = new ConcreteAggregate<String>();
        a.add("Aige");
        a.add("Studio\n");
        a.add("SM");
        a.add(" Brother");

        Iterator<String> i = a.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}

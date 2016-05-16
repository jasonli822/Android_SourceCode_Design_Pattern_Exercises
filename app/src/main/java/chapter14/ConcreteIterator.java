package chapter14;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jasonli822 on 2016/5/16.
 * 具体迭代器类
 */
public class ConcreteIterator<T> implements Iterator {
    private List<T> list = new ArrayList<T>();
    private int cursor = 0;

    public ConcreteIterator(List<T> list) {
        this.list = list;
    }


    @Override
    public boolean hasNext() {
        return cursor != list.size();
    }

    @Override
    public Object next() {
        T obj = null;
        if (this.hasNext()) {
            obj = this.list.get(cursor++);
        }
        return obj;
    }
}

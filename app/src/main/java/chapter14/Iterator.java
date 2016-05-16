package chapter14;

/**
 * Created by jasonli822 on 2016/5/16.
 * 迭代器接口
 */
public interface Iterator<T> {
    /**
     * 是否还有下一个元素
     * @return
     */
    boolean hasNext();

    /**
     * 返回当前位置的元素并将位置移至下一位
     * @return
     */
    T next();
}

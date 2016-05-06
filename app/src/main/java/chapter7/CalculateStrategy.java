package chapter7;

/**
 * Created by jasonli822 on 2016/5/6.
 * 计算接口
 */
public interface CalculateStrategy {
    /**
     * 按距离来计算价格
     * @param km
     * @return
     */
    public int calculatePrice(int km);
}

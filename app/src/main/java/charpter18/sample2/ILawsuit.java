package charpter18.sample2;

/**
 * Created by jasonli822 on 2016/5/17.
 * 诉讼接口类
 */
public interface ILawsuit {
    // 提交申请
    void submit();

    // 进行举证
    void burden();

    // 开始辩护
    void defend();

    // 诉讼完成
    void finish();
}

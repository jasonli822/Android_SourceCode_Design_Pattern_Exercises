package charpter18.sample2;

/**
 * Created by jasonli822 on 2016/5/18.
 */
public class Client {
    public static void main(String[] args) {
        // 构建一个小民
        ILawsuit xiaomin = new XiaoMin();

        // 构建一个代理律师并将小民作为构造参数传递进去
        ILawsuit laywer = new Lawer(xiaomin);

        // 律师提交诉讼申请
        laywer.submit();

        // 律师进行举证
        laywer.burden();

        // 律师替小民进行辩护
        laywer.defend();

        // 完成诉讼
        laywer.finish();
    }
}

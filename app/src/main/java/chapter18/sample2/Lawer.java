package chapter18.sample2;

/**
 * Created by jasonli822 on 2016/5/17.
 * 代理律师
 */
public class Lawer implements ILawsuit {
    private ILawsuit mLawsuit;  // 持有一个具体被代理者的引用

    public Lawer(ILawsuit lawsuit) {
        this.mLawsuit = lawsuit;
    }

    @Override
    public void submit() {
        mLawsuit.submit();
    }

    @Override
    public void burden() {
        mLawsuit.burden();
    }

    @Override
    public void defend() {
        mLawsuit.defend();
    }

    @Override
    public void finish() {
        mLawsuit.finish();
    }
}

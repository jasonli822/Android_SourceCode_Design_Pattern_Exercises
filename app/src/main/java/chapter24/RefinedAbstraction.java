package chapter24;

/**
 * Created by jasonli822 on 2016/5/20.
 */
public class RefinedAbstraction extends Abstraction {
    /**
     * 通过实现部分对象的引用构造抽象部分的对象
     *
     * @param implementor 实现部分对象的引用
     */
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    /**
     * 对父类抽象部分中的方法进行扩展
     */
    public void refinedOperation() {
        // 对Abstraction中的方法进行扩展
    }
}

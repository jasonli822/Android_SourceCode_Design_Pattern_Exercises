package chapter21;

/**
 * Created by jasonli822 on 2016/5/19.
 * 抽象装饰者
 */
public abstract class Decorator extends Component {
    private Component component; // 持有Component对象的一个引用

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        component.operate();
    }
}

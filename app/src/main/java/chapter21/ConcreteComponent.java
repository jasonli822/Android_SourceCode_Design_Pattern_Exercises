package chapter21;

/**
 * Created by jasonli822 on 2016/5/19.
 * 组件具体实现类
 */
public class ConcreteComponent extends Component {
    @Override
    public void operate() {
        System.out.println("具体逻辑");
    }
}

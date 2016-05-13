package chapter13;

/**
 * Created by jasonli822 on 2016/5/13.
 * Caretaker,负责管理Memoto
 */
public class Caretaker {
    Memoto mMemoto; // 备忘录

    /**
     * 存档
     * @param memoto
     */
    public void archive(Memoto memoto) {
        this.mMemoto = memoto;
    }

    /**
     * 获取存档
     * @return
     */
    public Memoto getmMemoto() {
        return mMemoto;
    }
}

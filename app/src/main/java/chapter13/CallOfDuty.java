package chapter13;

/**
 * Created by jasonli822 on 2016/5/13.
 * 游戏类，使命召唤游戏 (数据模型可能不太合理，这里我们只是简单演示)
 */
public class CallOfDuty {
    private int mCheckpoint = 1;
    private int mLifeValue = 100;
    private String mWeapon = "沙漠之鹰";

    // 玩游戏
    public void play() {
        System.out.println("玩游戏：" + String.format("第%d关", mCheckpoint) + " 奋战杀敌中");
        mLifeValue -= 10;
        System.out.println("进度神级啦");
        mCheckpoint++;
        System.out.println("到达 " + String.format("第%d关", mCheckpoint));
    }

    // 退出游戏
    public void quite() {
        System.out.println("----------------------");
        System.out.println("退出前的游戏属性：" + this.toString());
        System.out.println("退出游戏");
        System.out.println("----------------------");
    }

    /**
     * 创建备忘录
     * @return
     */
    public Memoto createMemoto() {
        Memoto memoto = new Memoto();
        memoto.mCheckpoint = mCheckpoint;
        memoto.mLifeValue = mLifeValue;
        memoto.mWeapon = mWeapon;
        return memoto;
    }

    public void restore(Memoto memoto) {
        this.mCheckpoint = memoto.mCheckpoint;
        this.mLifeValue = memoto.mLifeValue;
        this.mWeapon = memoto.mWeapon;
    }

    public int getCheckpoint() {
        return mCheckpoint;
    }

    public void setCheckpoint(int mCheckpoint) {
        this.mCheckpoint = mCheckpoint;
    }

    public int getLifeValue() {
        return mLifeValue;
    }

    public void setLifeValue(int mLifeValue) {
        this.mLifeValue = mLifeValue;
    }

    public String getWeapon() {
        return mWeapon;
    }

    public void setWeapon(String mWeapon) {
        this.mWeapon = mWeapon;
    }

    @Override
    public String toString() {
        return "CallOfDuty [mCheckpoint=" + mCheckpoint + ", mLifeValue=" + mLifeValue + ", mWeapon=" + mWeapon +  "]";
    }
}

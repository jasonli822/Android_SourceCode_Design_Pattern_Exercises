package chapter13;

/**
 * Created by jasonli822 on 2016/5/13.
 * 备忘录类
 */
public class Memoto {
    public int mCheckpoint;
    public int mLifeValue;
    public String mWeapon;

    @Override
    public String toString() {
        return "Memoto [mCheckpoint=" + mCheckpoint + ", mLifeValue=" + mLifeValue + ", mWeapon=" + mWeapon +  "]";
    }
}

package chapter13;

/**
 * Created by jasonli822 on 2016/5/13.
 * 客户端
 */
public class Client {
    public static void main(String[] args) {
        // 构建游戏对象
        CallOfDuty game = new CallOfDuty();
        // 1.打游戏
        game.play();;

        Caretaker caretaker = new Caretaker();
        // 2. 游戏存档
        caretaker.archive(game.createMemoto());
        // 3. 退出游戏
        game.quite();
        // 4. 恢复游戏
        CallOfDuty newGame = new CallOfDuty();
        newGame.restore(caretaker.getmMemoto());
    }
}

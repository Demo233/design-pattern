package observer.java.example1;

import java.util.Observable;
import java.util.Observer;

/**
 * @author zyh
 * @Description: 公鸡是观察者
 * @date 2020/11/296:00 下午
 */
public class Cock implements Observer {

    public void update(Observable o, Object arg) {
        System.out.println("公鸡打鸣");
    }
}

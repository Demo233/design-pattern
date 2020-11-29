package observer.java.example1;

import java.util.Observable;

/**
 * @author zyh
 * @Description:
 * @date 2020/11/296:01 下午
 */
public class Sun extends Observable {

    public void rise(){
        System.out.println("太阳升起");
        this.setChanged();
        // 通知所有的观察者
        this.notifyObservers();
    }
}

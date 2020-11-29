package observer;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author zyh
 * @Description: 抽象的主题
 * @date 2020/11/295:40 下午
 */
public abstract class Subject {

    private Vector observerVector = new Vector();

    // 注册观察者
    public void registerOberver(Observer observer) {
        observerVector.add(observer);
    }

    // 销毁观察者
    public void detach(Observer observer) {
        observerVector.removeElement(observer);
    }

    // 通知所有注册的观察者
    public void notifyObservers() {

        Enumeration elements = observers();
        while (elements.hasMoreElements()){
            ((Observer) elements.nextElement()).update();
        }
    }

    public Enumeration observers() {
        return ((Vector) observerVector.clone()).elements();
    }

}

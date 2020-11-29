package observer;

/**
 * @author zyh
 * @Description:
 * @date 2020/11/295:50 下午
 */
public class Client {

    public static void main(String[] args) {

        ConcreteSubject subject = new ConcreteSubject();
        Observer observer = new ConcreteObserver();
        subject.registerOberver(observer);

        subject.change("123");
        subject.change("456");


    }
}

package observer;

public class ConcreteSubject extends Subject{
    private String state;

    // 改变主题的方法。
    public void change(String newState){
        state = newState;
        this.notifyObservers();
    }
}

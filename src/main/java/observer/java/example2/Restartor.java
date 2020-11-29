package observer.java.example2;

import java.util.Observable;
import java.util.Observer;
import java.util.Random;

/**
 * @author zyh
 * @Description: 观察者，用于重启线程
 * @date 2020/11/296:17 下午
 */
public class Restartor implements Observer {

    public void update(Observable o, Object arg) {
        System.out.println("重启线程");
        if(condition1()) {
            System.out.println("检测到当前时间为9-10点,重启线程");
            new Thread(((JdbcQuerier) o)).start();
        }else{
            o = null;
            System.out.println("检测到当前时间不是9-10点,不重启线程");
        }
    }

    // 条件1: 必须是9-10点才重启
    public boolean condition1(){
        int i = new Random().nextInt();
        if(i % 2 == 0){
            return true;
        }
        return false;
    }
}

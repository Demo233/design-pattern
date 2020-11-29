package observer.java.example2;

/**
 * @author zyh
 * @Description:
 * @date 2020/11/296:33 下午
 */
public class Client {

    public static void main(String[] args) throws InterruptedException {
        // 被观察者
        JdbcQuerier jdbcQuerier = new JdbcQuerier();
        // 观察者
        Restartor restartor = new Restartor();
        //注册观察者
        jdbcQuerier.addObserver(restartor);

        // 运行线程
        Thread t1 = new Thread(jdbcQuerier);

        t1.start();
        while(true){
            Thread.sleep(1000L);
        }

    }
}

package observer.java.example2;

import java.sql.SQLException;
import java.util.Observable;
import java.util.Random;
import java.util.concurrent.TimeoutException;

/**
 * @author zyh
 * @Description: jdbc查询者,被观察对象
 * @date 2020/11/296:19 下午
 */
public class JdbcQuerier extends Observable implements Runnable {

    
    public void run() {
        System.out.println(Thread.currentThread().getName() + ":" + "线程运行");
        try{
            // 查询数据库
            queryData();
        }catch (TimeoutException e1){
            System.out.println(Thread.currentThread().getName() + ":" + "检测到Timeout异常");
            this.setChanged();
            this.notifyObservers();
        }catch (SQLException e2){
            System.out.println(Thread.currentThread().getName() + ":" + "检测到SQLException异常");
        }finally {
            System.out.println(Thread.currentThread().getName() + ":" + "线程终止");
        }
    }
    
    private void queryData() throws SQLException, TimeoutException {
        try{
            System.out.println(Thread.currentThread().getName() + ":" + "获取连接");
            System.out.println(Thread.currentThread().getName() + ":" + "select * from tableName");
            int i = new Random().nextInt();
            if(i % 2 == 0)
                throw new TimeoutException();    
            else
                throw new SQLException();
        }catch (SQLException e1){
            throw e1;
        }catch (TimeoutException e2){
            throw e2;
        }finally {
            System.out.println(Thread.currentThread().getName() + ":" + "关闭连接");
        }
        
    }

}

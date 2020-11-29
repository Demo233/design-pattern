package observer.java.example1;

/**
 * @author zyh
 * @Description:
 * @date 2020/11/296:02 下午
 */
public class Client {

    public static void main(String[] args) {
        Sun sun = new Sun();
        Cock cock = new Cock();
        sun.addObserver(cock);


        sun.rise();
    }
}

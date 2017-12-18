package Observer_Model;

/**
 * Created by ddp on 2017/11/26.
 */
public class Observer1 implements Observer {
    @Override
    public void update() {
        System.out.println("observer1 has received!");
    }
}

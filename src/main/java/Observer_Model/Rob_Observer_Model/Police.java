package Observer_Model.Rob_Observer_Model;

/**
 * 警察
 * Created by ddp on 2017/11/26.
 */
public class Police implements Watcher{
    @Override
    public void update() {
        System.out.println("运输车有行动，警察护航");
    }
}

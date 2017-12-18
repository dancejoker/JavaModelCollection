package Observer_Model.Rob_Observer_Model;

/**
 * Created by ddp on 2017/11/26.
 */
public class Thief implements Watcher {
    @Override
    public void update() {
        System.out.println("运输车有行动，强盗准备动手");
    }
}

package Observer_Model.Rob_Observer_Model;

/**
 * 具体的观察者
 * 保镖
 * Created by ddp on 2017/11/26.
 */
public class Security implements Watcher{
    @Override
    public void update() {
        System.out.println("运输车有行动，保安贴身保护");
    }
}

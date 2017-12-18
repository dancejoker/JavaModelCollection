package Observer_Model;

/**
 * Created by ddp on 2017/11/26.
 */
public class MySubject extends AbstractSubject  {
    @Override
    public void operation() {
        System.out.println("update self!");
        notifyObservers();
    }
}

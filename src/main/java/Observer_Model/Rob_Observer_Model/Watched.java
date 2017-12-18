package Observer_Model.Rob_Observer_Model;

/**
 * 抽象的被观察者，在其中声明方法（添加、移除观察者，通知观察者）：
 * Created by ddp on 2017/11/26.
 */
public interface Watched {
    //添加观察者
    public void addWatcher(Watcher watcher);
    //删除观察者
    public void removeWatcher(Watcher watcher);
    //通知观察者
    public void notifyWatchers();
}

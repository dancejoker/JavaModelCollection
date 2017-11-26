package Template_Model.CarStart_Model;

/**
 * Created by ddp on 2017/11/26.
 */
public abstract class CarModel {
    /**
     * 汽车启动
     */
    protected abstract void start();

    /**
     * 停车
     */
    protected abstract void stop();

    /**
     * 用户并不需要关注你的车怎么启动或者停下来的，可以开可以停就可以啦
     */
    final public void excet(){
        this.start();
        this.stop();
    }
}

package Template_Model.CarStart_Model;

/**
 * 大众车
 * Created by ddp on 2017/11/26.
 */
public class VWcar extends CarModel{
    @Override
    protected void start() {
        System.out.println("大众车启动 。。。。。。。。突突突");
    }

    @Override
    protected void stop() {
        System.out.println("大众车停车。。。。。。。。。");
    }
}

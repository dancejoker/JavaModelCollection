package Template_Model.CarStart_Model;

/**
 * Created by ddp on 2017/11/26.
 */
public class AutiCar extends CarModel {
    @Override
    protected void start() {
        System.out.println("奥迪...无匙启动......突突突");
    }

    @Override
    protected void stop() {
        System.out.println("奥迪....停车");
    }
}

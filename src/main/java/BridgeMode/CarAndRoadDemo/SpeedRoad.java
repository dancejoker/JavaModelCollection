package BridgeMode.CarAndRoadDemo;

/**
 * Created by ddp on 2017/11/19.
 */
public class SpeedRoad extends Road {
    @Override
    public void Run() {
        super.Run();
        car.name();
        System.out.println("在高速公路上行驶");
    }

}

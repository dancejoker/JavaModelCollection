package BridgeMode.CarAndRoadDemo;

/**
 * Created by ddp on 2017/11/19.
 */
public class Women extends People {
    @Override
    public void Drive() {
        System.out.print("女人开着");
        road.Run();
        super.Drive();
    }
}

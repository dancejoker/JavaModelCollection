package BridgeMode.CarAndRoadDemo;

/**
 * Created by ddp on 2017/11/19.
 */
public class Men extends People{
    @Override
    public void Drive() {
        System.out.print("男人开着");
        road.Run();
        super.Drive();
    }
}

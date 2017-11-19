package BridgeMode.CarAndRoadDemo;

/**
 * Created by ddp on 2017/11/19.
 */
public class BridgeTest {
    public static void main(String[] args) {
        Car sportCar = new Sportscar();
        Car bus = new Bus();
        Road speedRoad = new SpeedRoad();
        Road street = new Street();
        People men = new Men();
        People women = new Women();

        speedRoad.setCar(sportCar);
        men.setRoad(speedRoad);
        men.Drive();
        speedRoad.setCar(bus);
        men.setRoad(speedRoad);
        men.Drive();


        street.setCar(sportCar);
        women.setRoad(street);
        women.Drive();
        street.setCar(bus);
        women.setRoad(street);
        women.Drive();

    }
}

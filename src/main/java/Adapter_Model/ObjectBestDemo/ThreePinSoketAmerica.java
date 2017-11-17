package Adapter_Model.ObjectBestDemo;

/**
 * Created by ddp on 2017/11/12.
 */
public class ThreePinSoketAmerica implements ThreePinSoket{
    @Override
    public void chargeWithThreePin() {
        System.out.println("美国标准的三孔的插座");
    }

    @Override
    public int voltage() {
        return 110;
    }
}

package Adapter_Model.ObjectBestDemo;

/**
 * client(具体的adaptee) ———— 这个就是我在中国的墙上的两个插孔的插座，我充电只能用这个
 * Created by ddp on 2017/11/12.
 */
public class TwoPinSoketChina implements TwoPinSoket {
    @Override
    public void chargeWithTwoPin() {
        System.out.println("中国标准的两孔的插座");
    }

    @Override
    public int voltage() {
        return 220;
    }
}

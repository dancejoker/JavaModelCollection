package Adapter_Model.ClassBestDemo;

/**
 * 去美国旅游，必须带上一个“美国适配器”：实现两孔插座，组合三孔插座。用来给我的三星手机充电
 * Created by ddp on 2017/11/12.
 */
public class AmericaAdapter  implements TwoPinSoket{
    ThreePinSoket threePinSoket; // 组合三孔插座(adaptee)

    public AmericaAdapter(ThreePinSoket threePinSoket) {
        this.threePinSoket = threePinSoket;
    }

    @Override
    public void chargeWithTwoPin() {
        threePinSoket.chargeWithThreePin();
    }

    @Override
    public int voltage() {
        return threePinSoket.voltage() * 2; // 适配器把电压从 110V 升到 220V
    }
}

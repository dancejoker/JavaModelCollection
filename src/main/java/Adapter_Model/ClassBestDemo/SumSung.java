package Adapter_Model.ClassBestDemo;

/**
 * Created by ddp on 2017/11/12.
 */
public class SumSung {
    TwoPinSoket twoPinSoket;

    public SumSung() {
    }

    public TwoPinSoket getTwoPinSoket() {
        return twoPinSoket;
    }

    public void setTwoPinSoket(TwoPinSoket twoPinSoket) {
        this.twoPinSoket = twoPinSoket;
    }

    public void chargeRequest() {
        System.out.println("三星S7edge手机， " + twoPinSoket.voltage() + " 伏特充电中\n");
    }
}

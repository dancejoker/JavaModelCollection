package Adapter_Model.ObjectBestDemo;

/**
 * target(适配目标) ———— 我的三星手机充电器是两个插头，所以需要两个插孔的插座
 * Created by ddp on 2017/11/12.
 */
public interface TwoPinSoket {
    public void chargeWithTwoPin();  //二插头
    public int voltage();  //插头电压
}

package Adapter_Model.ObjectBestDemo;

/**
 * adaptee(被适配者) ———— 假设在美国某旅馆的墙上，只有一个三孔插座
 * Created by ddp on 2017/11/12.
 */
public interface ThreePinSoket {
    public void chargeWithThreePin(); //3插头
    public int  voltage();     //插头电压
}

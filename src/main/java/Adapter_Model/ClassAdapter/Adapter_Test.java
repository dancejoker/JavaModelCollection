package Adapter_Model.ClassAdapter;

/**
 * 适配器模式把一个类的接口变换成客户端所期待的另一种接口，
 * 从而使原本因接口不匹配而无法在一起工作的两个类能够在一起工作。
 * Created by ddp on 2017/11/12.
 */
public class Adapter_Test {
    public static void main(String[] args) {
        //Targetable接口的实现类就具有了Source类的功能。
        Targetable target = new Adapter();
        target.method1();
        target.method2();
    }
}

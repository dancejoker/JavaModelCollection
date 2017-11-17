package Adapter_Model.InterfaceAdapter;

/**
 * Created by ddp on 2017/11/17.
 */
public class Inerface_Test {
    public static void main(String[] args) {
        SourceSub1 source1 = new SourceSub1();
        SourceSub2 source2 = new SourceSub2();
        source1.method1();
        source1.method2();

        source2.method1();
        source2.method2();
    }
}

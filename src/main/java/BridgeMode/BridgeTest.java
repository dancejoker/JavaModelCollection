package BridgeMode;

/**
 * Created by ddp on 2017/11/17.
 */
public class BridgeTest {
    public static void main(String[] args) {
        MyBridge myBridge = new MyBridge();
        /*调用第一个对象*/
        SourceSub1 source1 = new SourceSub1();
        myBridge.setSource(source1);
        myBridge.method();

        /*调用第二个对象*/
        SourceSub2 source2 = new SourceSub2();
        myBridge.setSource(source2);
        myBridge.setSource(source2);
        myBridge.method();
    }
}

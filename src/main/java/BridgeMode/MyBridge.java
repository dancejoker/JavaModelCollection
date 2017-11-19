package BridgeMode;

/**
 * Created by ddp on 2017/11/17.
 */
public class MyBridge extends Bridge {
    public void method() {
        getSource().method();
    }
}

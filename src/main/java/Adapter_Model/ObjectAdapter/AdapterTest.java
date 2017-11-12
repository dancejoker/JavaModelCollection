package Adapter_Model.ObjectAdapter;

/**
 * Created by ddp on 2017/11/12.
 */
public class AdapterTest {
    public static void main(String[] args) {
        Source source = new Source();
        Targetable target = new Wrapper(source);
        target.method1();
        target.method2();
    }
}

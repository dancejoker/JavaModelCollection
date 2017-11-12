package Adapter_Model.ObjectAdapter;

/**
 * Created by ddp on 2017/11/12.
 */
public class Wrapper implements Targetable{
    private Source source;
    public Wrapper(Source source){
        super();
        this.source = source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}

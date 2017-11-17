package Proxy_Model;

/**
 * Created by ddp on 2017/11/17.
 */
public class Proxy implements Sourceable {
    private Source source;

    public Proxy() {
        this.source = new Source();
    }

    @Override
    public void method() {
        before();
        source.method();
        atfer();
    }

    private void atfer() {
        System.out.println("调用方法前对原来的功能进行改进");
    }
    private void before() {
        System.out.println("调用方法后对原来的功能进行改进");
    }
}

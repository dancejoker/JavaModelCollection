package Proxy_Model;

/**
 * Created by ddp on 2017/11/17.
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("通过Proxy来代理Source进行工作");
    }
}

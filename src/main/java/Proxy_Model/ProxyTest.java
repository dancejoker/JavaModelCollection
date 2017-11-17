package Proxy_Model;

/**
 * Created by ddp on 2017/11/17.
 */
public class ProxyTest {
    public static void main(String[] args) {
        Sourceable source = new Proxy();
        source.method();
    }
}

package Decorator_Model;

/**
 * 装饰模式就是给一个对象增加一些新的功能，而且是动态的，
 * 要求装饰对象和被装饰对象实现同一个接口，装饰对象持有被装饰对象的实例
 * Created by ddp on 2017/11/17.
 */
public class Decorator_Test {
    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable obj = new Decorator(source);
        obj.method();
    }
}

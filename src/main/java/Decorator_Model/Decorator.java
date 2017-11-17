package Decorator_Model;

/**
 * Created by ddp on 2017/11/17.
 */
public class Decorator implements Sourceable {
    private Sourceable source;

    public Decorator(Sourceable source) {
        this.source = source;
    }

    @Override
    public void method() {
        System.out.println("调用函数之前可以进行添加功能");
        source.method();
        System.out.println("调用函数之后可以进行添加功能");

    }
}

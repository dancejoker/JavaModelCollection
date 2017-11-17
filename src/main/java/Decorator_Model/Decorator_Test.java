package Decorator_Model;

/**
 * Created by ddp on 2017/11/17.
 */
public class Decorator_Test {
    public static void main(String[] args) {
        Sourceable source = new Source();
        Sourceable obj = new Decorator(source);
        obj.method();
    }
}

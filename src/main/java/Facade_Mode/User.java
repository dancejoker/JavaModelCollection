package Facade_Mode;

/**
 * 外观模式
 *为了解决类与类之家的依赖关系的。
 * 客户角色:通过调用Facede来完成要实现的功能。
 * Created by ddp on 2017/11/17.
 */
public class User {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.startup();
        computer.shutdown();
    }
}

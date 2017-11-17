package Facade_Mode;

/**
 * 子系统角色
 * 实现了子系统的功能。它对客户角色和Facade时未知的。
 * 它内部可以有系统内的相互交互，也可以由供外界调用的接口。
 * Created by ddp on 2017/11/17.
 */
public class CPU {
    public void startup(){
        System.out.println("启动Cpu!");
    }
    public void shutdown(){
        System.out.println("关闭Cpu !");
    }
}

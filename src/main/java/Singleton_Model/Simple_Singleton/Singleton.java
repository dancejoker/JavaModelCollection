package Singleton_Model.Simple_Singleton;

/**
 * 单例模式的好处:
 * 1.某些类创建比较频繁，对于一些大型的对象，这是一笔很大的系统开销。
 * 2.省去了new操作符，降低了系统内存的使用频率，减轻GC压力。
 * 3.有些类如交易所的核心交易引擎，控制着交易流程，如果该类可以创建多个的话，
 * 系统完全乱了。（比如一个军队出现了多个司令员同时指挥，肯定会乱成一团），
 * 所以只有使用单例模式，才能保证核心交易服务器独立控制整个流程。
 *
 * 单线程下该代码没有问题，若是多线程就会出现问题
 * Created by ddp on 2017/11/10.
 */
public class Singleton {
    /* 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static Singleton instance= null;
    /* 私有构造方法，防止被实例化 */
    private Singleton(){
        System.out.println("hello Singleton_demo");
    }
    public static Singleton getInstance(){
       if(instance == null)
           instance = new Singleton();
       return instance;
    }

    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
    }
}

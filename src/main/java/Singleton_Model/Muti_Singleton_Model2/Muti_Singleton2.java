package Singleton_Model.Muti_Singleton_Model2;

/**
 * 优点：将synchronized关键字加在了内部，
 * 也就是说当调用的时候是不需要加锁的，只有在instance为null，
 * 并创建对象的时候才需要加锁，性能有一定的提升。
 *
 * 缺点(核心原因是指令重排)：在Java指令中创建对象和赋值操作是分开进行的，
 * 也就是说instance = new Singleton();语句是分两步执行的。
 * 但是JVM并不保证这两个操作的先后顺序，也就是说有可能JVM会为新的Singleton实例分配空间，
 * 然后直接赋值给instance成员，然后再去初始化这个Singleton实例。
 *
 * 在创建对象的时候，先调用jvm指令new，为对象分配内存，
 * 然后调用invokspecial来调用<init>函数来对对象初始化
 * 赋值和初始化的顺序无法确定
 * Created by ddp on 2017/11/12.
 */
public class Muti_Singleton2 {
    private static Muti_Singleton2 instance = null;
    private Muti_Singleton2(){
    }

    public static Muti_Singleton2 getInstance(){
        /**
         *双重校验锁
         *
         */
        if(instance == null){
            synchronized (instance){
                if(instance == null)
                    instance = new Muti_Singleton2();
            }
        }
        return instance;
    }
}

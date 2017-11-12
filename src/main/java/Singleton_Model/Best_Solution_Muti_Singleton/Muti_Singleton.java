package Singleton_Model.Best_Solution_Muti_Singleton;

import Singleton_Model.Simple_Singleton.Singleton;

/**
 * 使用锁在解决指令顺序的问题，避开锁问题
 * 缺点：如果在构造函数中抛出异常，实例将永远得不到创建，也会出错。
 * Created by ddp on 2017/11/12.
 */
public class Muti_Singleton {
    /* 私有构造方法，防止被实例化 */
    private Muti_Singleton() {
    }
    /*  此处使用一个内部类来维护单例 */
    private static class Singleton_Factory{
        private static Muti_Singleton instance = new Muti_Singleton();
    }
    public static Muti_Singleton getInstance(){
        return Singleton_Factory.instance;
    }

}

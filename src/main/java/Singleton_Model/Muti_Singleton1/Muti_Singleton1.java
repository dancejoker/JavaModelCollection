package Singleton_Model.Muti_Singleton1;

/**
 * Created by ddp on 2017/11/12.
 */
public class Muti_Singleton1 implements Runnable{
    private static Muti_Singleton1 muti_singleton= null;
    private Muti_Singleton1(){
        System.out.println("create muti_singleton");
    }
    public static synchronized Muti_Singleton1 getinstance(){
        if(muti_singleton == null)
            muti_singleton = new Muti_Singleton1();
        return muti_singleton;
    }

    @Override
    public void run() {
        System.out.println("run run run!");
    }
}

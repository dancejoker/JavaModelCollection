package Singleton_Model.Muti_Singleton1;

/**
 * Created by ddp on 2017/11/12.
 */
public class Main {
    public static void main(String[] args) {
        Thread thread1 = new Thread(Muti_Singleton1.getinstance());
        Thread thread2 = new Thread(Muti_Singleton1.getinstance());
        Thread thread3 = new Thread(Muti_Singleton1.getinstance());
        thread1.run();
        thread2.run();
        thread3.run();
    }
}

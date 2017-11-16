package Singleton_Model.Best_Solution_Muti_Singleton;

/**
 * Created by ddp on 2017/11/16.
 */
public class Best_Main {
    public static void main(String[] args) {
        Thread t1 = new Thread(Muti_Singleton.getInstance());
        Thread t2 = new Thread(Muti_Singleton.getInstance());
        t1.run();
        t2.run();
    }
}

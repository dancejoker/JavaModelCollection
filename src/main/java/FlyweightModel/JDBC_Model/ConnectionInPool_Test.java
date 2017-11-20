package FlyweightModel.JDBC_Model;

import java.sql.Connection;

/**
 * Created by ddp on 2017/11/20.
 */
public class ConnectionInPool_Test {
    public static void main(String[] args) {
        Thread t1 = new Thread() {
            @Override
            public void run() {
                Connection con = null;
                ConnectionPool pool = null;
                try {
                    pool = ConnectionPool.getConnectionPool();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                con = pool.getConnection();
                pool.release();
            }
        };
        t1.start();

        Thread t2 = new Thread() {
            @Override
            public void run() {
                Connection con = null;
                ConnectionPool pool = null;
                try {
                    pool = ConnectionPool.getConnectionPool();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                con = pool.getConnection();
                System.out.println(con);
                pool.release();
            }
        };
        t2.start();
    }
}

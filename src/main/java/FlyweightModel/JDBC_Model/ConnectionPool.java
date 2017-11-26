package FlyweightModel.JDBC_Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Vector;

/**
 * Created by ddp on 2017/11/20.
 */
public class ConnectionPool {
    private Vector<Connection> pool;
    /*公有属性*/
    private String url = "jdbc:mysql://localhost:3306/test";
    private String username = "root";
    private String password = "wangqi123";
    private String driverClassName = "com.mysql.jdbc.Driver";

    //还在线程池中连接
    private static int ConnectionInPool=0;

    private int poolSize = 100;
    private static ConnectionPool instance = null;
    Connection conn = null;


    public synchronized static ConnectionPool getConnectionPool() throws Exception {
        if(instance == null)
             instance = new ConnectionPool();
        return instance;
    }

    /*构造方法，做一些初始化工作*/
    private ConnectionPool() throws Exception {
        pool = new Vector<Connection>(poolSize);
        ConnectionInPool = poolSize;
        for(int i = 0;i < poolSize;++i){
                Class.forName(driverClassName);
                conn = DriverManager.getConnection(url, username, password);
                pool.add(conn);
        }
    }

    /* 返回连接到连接池 */
    public synchronized void release() {
        if(conn == null)
            return;
        pool.add(conn);
        ConnectionInPool++;
        System.out.println("连接池中已经有了" + ConnectionInPool + "个连接");
    }


    /* 返回连接池中的一个数据库连接 */
    public synchronized Connection getConnection() {
        if (pool.size() > 0) {
            Connection conn = pool.get(0);
            pool.remove(conn);
            ConnectionInPool--;
            System.out.println("连接池中已经有了" + ConnectionInPool + "个连接");
            return conn;
        } else {
            return null;
        }
    }
}

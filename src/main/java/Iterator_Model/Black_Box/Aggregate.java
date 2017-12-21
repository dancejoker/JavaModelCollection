package Iterator_Model.Black_Box;

/**
 * Created by ddp on 2017/12/20.
 */
public abstract class Aggregate {
    /**
     * 工厂方法，创建相应迭代子对象的接口
     */
    public abstract Iterator createIterator();
}

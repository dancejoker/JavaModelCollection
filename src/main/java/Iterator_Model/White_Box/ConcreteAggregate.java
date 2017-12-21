package Iterator_Model.White_Box;

/**
 * Created by ddp on 2017/12/20.
 */
public class ConcreteAggregate extends Aggregate {

    private Object[] objectArray = null;

    /**
     * 构造方法，传入聚合对象的具体内容
     */
    public ConcreteAggregate(Object[] objectArray) {
        this.objectArray = objectArray;
    }

    @Override
    public Iterator createIterator() {
        return new ConcretIterator(this);
    }

    /**
     * 取值方法：向外界提供聚集元素
     */
    public Object getElement(int index){
        if(index < objectArray.length)
            return objectArray[index];
        else
            return null;
    }

    /**
     * 取值方法：向外界提供聚集的大小
     */
    public int size(){
        return objectArray.length;
    }
}

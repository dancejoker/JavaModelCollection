package FlyweightModel.Flyweight_Model2;

/**
 * Created by ddp on 2017/11/20.
 */
public class ConcreteFlyweight  extends Flyweight {
    private String string;
    public ConcreteFlyweight(String str){
       this.string = str;
    }
    @Override
    public void operation() {
        System.out.println("Concrete---Flyweight : " + string);
    }
}

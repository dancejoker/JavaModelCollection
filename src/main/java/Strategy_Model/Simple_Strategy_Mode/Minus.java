package Strategy_Model.Simple_Strategy_Mode;

/**
 * Created by ddp on 2017/11/20.
 */
public class Minus extends AbstractCalculator implements ICalculator {
    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"-");
        return arrayInt[0]-arrayInt[1];
    }
}

package Strategy_Model.Simple_Strategy_Mode;

/**
 * Created by ddp on 2017/11/20.
 */
public class StrategyTest {
    public static void main(String[] args) {
        String exp = "2+8";
        ICalculator cal = new Plus();
        int result = cal.calculate(exp);
        System.out.println(result);
    }
}

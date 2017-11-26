package Template_Model;

/**
 * Created by ddp on 2017/11/26.
 */
public class Template_Test {
    public static void main(String[] args) {
        String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }
}

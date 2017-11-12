package Abstract_Factory_Method_Model;

/**
 * Created by ddp on 2017/11/10.
 */
public class SmsSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is Sms sender!");
    }
}

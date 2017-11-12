package Factory_Method_Model;

/**
 * Created by ddp on 2017/11/10.
 */
public class SmsSender implements Sender {
    public void Send() {
        System.out.println("This is Sms sender");
    }
}

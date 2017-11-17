package Builder_Model;

import Factory_Method_Model.Sender;

/**
 * Created by ddp on 2017/11/10.
 */
public class SmsSender implements Sender {
    public SmsSender() {
        System.out.println("构架 Sms Sender");
    }

    public void Send() {
        System.out.println("This is Sms sender");
    }
}

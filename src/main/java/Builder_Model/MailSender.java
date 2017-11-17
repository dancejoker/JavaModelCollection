package Builder_Model;

import Factory_Method_Model.Sender;

/**
 * Created by ddp on 2017/11/10.
 */
public class MailSender implements Sender{
    public MailSender() {
        System.out.println("构建 Mail Sender ！");
    }

    public void Send() {
        System.out.println("this is Mail send");
    }
}

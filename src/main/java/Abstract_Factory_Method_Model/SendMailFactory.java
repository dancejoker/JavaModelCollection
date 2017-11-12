package Abstract_Factory_Method_Model;

/**
 * Created by ddp on 2017/11/10.
 */
public class SendMailFactory implements Provider {
    public Sender produce() {
        return new MailSender();
    }
}

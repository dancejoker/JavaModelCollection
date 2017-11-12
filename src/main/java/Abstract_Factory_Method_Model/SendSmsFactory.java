package Abstract_Factory_Method_Model;

/**
 * Created by ddp on 2017/11/10.
 */
public class SendSmsFactory implements Provider {
    public Sender produce() {
        return new SmsSender();
    }
}

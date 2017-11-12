package Factory_Method_Model;

/**
 * 建立一个工厂类，对实现了同一接口的一些类进行实例的创建。
 * Created by ddp on 2017/11/10.
 */
public class FactoryTest {
    public static void main(String[] args) {
        SenderFactory senderFactory = new SenderFactory();
        Sender sender = senderFactory.produce("sms");
        sender.Send();
    }
}

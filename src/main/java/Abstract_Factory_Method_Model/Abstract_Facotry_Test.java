package Abstract_Factory_Method_Model;

/**
 * 工厂方法模式有一个问题就是，类的创建依赖工厂类，也就是说，如果想要拓展程序，必须对工厂类进行修改，这违背了闭包原则
 * 解决方法就是使用抽象工厂模式
 * 抽象工厂模式
 * 优点：如果你现在想增加一个功能：发及时信息，则只需做一个实现类，实现Sender接口，同时做一个工厂类，实现Provider接口，就OK了，
 * 无需去改动现成的代码。
 * Created by ddp on 2017/11/10.
 */
public class Abstract_Facotry_Test {
    public static void main(String[] args) {
        //调用mail发信息
        SendMailFactory sendMailFactory = new SendMailFactory();
        Sender mailproduce = sendMailFactory.produce();
        mailproduce.Send();
        //调用sms发信息
        SendSmsFactory sendSmsFactory = new SendSmsFactory();
        Sender smsproduce = sendSmsFactory.produce();
        smsproduce.Send();

    }
}

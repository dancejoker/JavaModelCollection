package ChainOfResponsibility_Model;

/**
 * Created by ddp on 2017/12/22.
 */
public class MyHandler extends AbstractHandler implements Handler {

    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name + " 处理问题");
        if(name == "h2")  //若h2可以处理问题，则进行处理，退出
            return;
        if(getHandler() != null)
            getHandler().operator();
    }
}

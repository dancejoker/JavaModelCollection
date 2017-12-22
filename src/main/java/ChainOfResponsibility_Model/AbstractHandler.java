package ChainOfResponsibility_Model;

/**
 * Created by ddp on 2017/12/22.
 */
public abstract class AbstractHandler {
    private Handler handler;

    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }
}

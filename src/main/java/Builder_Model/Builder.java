package Builder_Model;

import java.util.List;

/**
 * Created by ddp on 2017/11/17.
 */
public class Builder {
    public void produceMailSender(List list, int count) {
        for (int i = 0; i < count; i++) {
            list.add(new MailSender());
        }
    }

    public void produceSmsSender(List list, int count) {
        for (int i = 0; i < count; i++) {
            list.add(new SmsSender());
        }
    }
}

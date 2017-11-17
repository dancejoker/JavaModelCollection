package Builder_Model;

import java.util.ArrayList;

/**
 * Created by ddp on 2017/11/17.
 */
public class Builder_Test {
    public static void main(String[] args) {
        ArrayList<Sender> senders = new ArrayList<Sender>();
        Builder builder = new Builder();
        builder.produceMailSender(senders,5);
        builder.produceSmsSender(senders,5);
    }
}

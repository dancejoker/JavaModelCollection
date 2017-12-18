package Observer_Model.Rob_Observer_Model;

/**
 * Created by ddp on 2017/12/18.
 */
public class Rob_Observer_Test {
    public static void main(String[] args) {
        Transporter transporter = new Transporter();
        Police police = new Police();
        Security security = new Security();
        Thief thief = new Thief();
        transporter.addWatcher(police);
        transporter.addWatcher(security);
        transporter.addWatcher(thief);

        transporter.notifyWatchers();
    }
}

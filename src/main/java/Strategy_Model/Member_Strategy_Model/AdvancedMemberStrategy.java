package Strategy_Model.Member_Strategy_Model;

/**
 * Created by ddp on 2017/11/20.
 */
public class AdvancedMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double booksPrice) {

        System.out.println("对于高级会员的折扣为20%");
        return booksPrice * 0.8;
    }
}

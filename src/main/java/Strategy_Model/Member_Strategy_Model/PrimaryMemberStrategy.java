package Strategy_Model.Member_Strategy_Model;

/**
 * 初级会员
 * Created by ddp on 2017/11/20.
 */
public class PrimaryMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double booksPrice) {

        System.out.println("对于初级会员的没有折扣");
        return booksPrice;
    }

}

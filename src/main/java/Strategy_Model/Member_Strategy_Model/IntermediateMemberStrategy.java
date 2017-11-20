package Strategy_Model.Member_Strategy_Model;

/**
 * 中技会员
 * Created by ddp on 2017/11/20.
 */
public class IntermediateMemberStrategy implements MemberStrategy  {
    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("对于中级会员的折扣为10%");
        return booksPrice * 0.9;
    }
}

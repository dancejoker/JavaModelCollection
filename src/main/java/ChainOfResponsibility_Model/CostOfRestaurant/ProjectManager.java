package ChainOfResponsibility_Model.CostOfRestaurant;

/**
 * 项目经理
 * Created by ddp on 2017/12/22.
 */
public class ProjectManager extends Handler {
    @Override
    public String handleFeeRequest(String user, double fee) {
        String str = "";
        if(fee < 500){
            if("老中医".equals(user))
                str  =  "成功：项目经理同意【" + user + "】的聚餐费用，金额为" + fee + "元";
            else
                //其他人一律不同意
                str = "失败：项目经理不同意【" + user + "】的聚餐费用，金额为" + fee + "元";
        }else {
            if(getSuccessor() != null)
                return getSuccessor().handleFeeRequest(user,fee);
        }
        return str;
    }
}

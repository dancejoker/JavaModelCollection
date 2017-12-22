package ChainOfResponsibility_Model.CostOfRestaurant;

/**
 * 部门经理
 * Created by ddp on 2017/12/22.
 */
public class DeptManager extends Handler{
    @Override
    public String handleFeeRequest(String user, double fee) {
        String str = "";
        //部门经理的权限只能在1000以内
        if(fee <= 1000){
            if("老中医".equals(user))
                str = "成功：部门经理同意【" + user + "】的聚餐费用，金额为" + fee + "元";
            else
                //其他人一律不同意
                str = "失败：部门经理不同意【" + user + "】的聚餐费用，金额为" + fee + "元";
        }else {
            if(getSuccessor() != null)
                return getSuccessor().handleFeeRequest(user, fee);
        }
        return str;
    }
}

package ChainOfResponsibility_Model.CostOfRestaurant;

/**
 * Created by ddp on 2017/12/22.
 */
public class Client {
    public static void main(String[] args) {
        //先要组装责任链
        ProjectManager projectManager = new ProjectManager();
        DeptManager deptManager = new DeptManager();
        GeneralManager generalManager = new GeneralManager();

        projectManager.setSuccessor(deptManager);
        deptManager.setSuccessor(generalManager);

        //开始测试
        String test1 = projectManager.handleFeeRequest("张三", 300);
        System.out.println("test1 = " + test1);
        String test2 = projectManager.handleFeeRequest("老中医", 300);
        System.out.println("test2 = " + test2);
        System.out.println("---------------------------------------");

        String test3 = projectManager.handleFeeRequest("张三", 700);
        System.out.println("test3 = " + test3);
        String test4 = projectManager.handleFeeRequest("老中医", 700);
        System.out.println("test4 = " + test4);
        System.out.println("---------------------------------------");

        String test5 = projectManager.handleFeeRequest("张三", 1500);
        System.out.println("test5 = " + test5);
        String test6 = projectManager.handleFeeRequest("老中医", 1500);
        System.out.println("test6 = " + test6);
    }
}

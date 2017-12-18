package Template_Model.Person_Work_Model;

/**
 * Created by ddp on 2017/11/26.
 */
public class Client {
    public static void main(String[] args) {
        AbstractPerson student = new Student();
        student.prepareGotoSchool();

        Teacher teacher  = new Teacher();
        teacher.prepareGotoSchool();
    }
}

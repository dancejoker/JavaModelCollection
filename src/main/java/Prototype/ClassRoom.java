package Prototype;

import java.io.Serializable;

/**
 * Created by ddp on 2017/11/16.
 */
public class ClassRoom implements Serializable {
    public int stu_num;    //学生人数
    public String  class_monitor;   //班长

    public ClassRoom(int stu_num, String  class_monitor) {
        this.stu_num = stu_num;
        this. class_monitor =  class_monitor;
    }

    public int getStu_num() {
        return stu_num;
    }

    public void setStu_num(int stu_num) {
        this.stu_num = stu_num;
    }

    public String getTeacher_name() {
        return  class_monitor;
    }

    public void setTeacher_name(String  class_monitor) {
        this. class_monitor =  class_monitor;
    }

//    @Override
//    public String toString() {
//        return "ClassRoom{" +
//                "stu_num=" + stu_num +
//                ", class_monitor='" + class_monitor + '\'' +
//                '}';
//    }
}

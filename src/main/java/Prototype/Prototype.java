package Prototype;

import java.io.*;

/**
 * Created by ddp on 2017/11/12.
 */
public class Prototype implements Cloneable,Serializable {
    public String teacher;
    public ClassRoom classRoom = null;

    protected Prototype clone() throws CloneNotSupportedException {
        Prototype clone = (Prototype) super.clone();
        return clone;
    }

    public Prototype(String teacher, ClassRoom classRoom) {
        this.teacher = teacher;
        this.classRoom = classRoom;
    }
    /**
     * 要实现深复制，
     * 需要采用流的形式读入当前对象的二进制输入，
     * 再写出二进制数据对应的对象
     */
    public Object deepclone() throws IOException, ClassNotFoundException {
        /* 写入当前对象的二进制流 */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        /* 读出二进制流产生的新对象 */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }


    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

//    @Override
//    public String toString() {
//        return "Prototype{" +
//                "teacher='" + teacher + '\'' +
//                ", classRoom=" + classRoom +
//                '}';
//    }
}

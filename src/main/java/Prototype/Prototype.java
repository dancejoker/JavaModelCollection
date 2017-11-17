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
     *
     * 利用串行化来做深复制
     * 把对象写道流里的过程是串行化(Serilization)过程;把对象从流中读出来是并行化(Deserialization)过程.
     * 写在流里的是对象的一个拷贝,然后再从流里读出来重建对象.
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

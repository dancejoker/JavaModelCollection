package Prototype;

import java.io.IOException;

/**
 * 浅复制：将一个对象复制后，基本数据类型的变量都会重新创建，
 * 而引用类型，指向的还是原对象所指向的。
 *
 * 深复制：将一个对象复制后，不论是基本数据类型还有引用类型，
 * 都是重新创建的。简单来说，就是深复制进行了完全彻底的复制，而浅复制不彻底。
 *
 * 适用环境：
 * 需要创建一个复杂的、构造耗时很多的对象，且已有一个同类对象的时候。
 * 消费者不关心对象构造过程的时候。
 * Created by ddp on 2017/11/12.
 */
public class Proto_Test {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        ClassRoom classRoom = new ClassRoom(20, "张三");
        Prototype prototype = new Prototype("王老师", classRoom);
        Prototype prototype2 = (Prototype) prototype.deepclone();

        prototype2.setTeacher("王浩");
        prototype2.getClassRoom().setStu_num(10);
        prototype2.getClassRoom().setTeacher_name("王麻子");

        System.out.println(prototype.getClassRoom().getStu_num() + " " + prototype.getClassRoom().getTeacher_name() + " " + prototype.getTeacher());
        System.out.println(prototype2.getClassRoom().getStu_num() + " " + prototype2.getClassRoom().getTeacher_name() + " "  + prototype2.getTeacher());
    }
}

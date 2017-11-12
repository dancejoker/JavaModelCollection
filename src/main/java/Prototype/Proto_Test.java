package Prototype;

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
    public static void main(String[] args) throws CloneNotSupportedException {
        Prototype prototype = new Prototype();
        prototype.setString("A");
        SerializableObject serialnum = new SerializableObject();
        serialnum.setNum(1);
        serialnum.setSerialVersionUID(20L);
        prototype.setObj(serialnum);

        Prototype copyProtype = (Prototype) prototype.clone();

        SerializableObject serialnum2 = new SerializableObject();
        serialnum2.setNum(2);
        serialnum2.setSerialVersionUID(200L);
        copyProtype.setObj(serialnum2);
        copyProtype.setString("B");

        System.out.println(prototype);
        System.out.println(copyProtype);
    }
}

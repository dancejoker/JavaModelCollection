package Prototype;

import java.io.Serializable;

/**
 * Created by ddp on 2017/11/12.
 */
public class SerializableObject implements Serializable {
    private  Long serialVersionUID = null;
    private int num ;

    public Long getSerialVersionUID() {
        return serialVersionUID;
    }

    public void setSerialVersionUID(Long serialVersionUID) {
        this.serialVersionUID = serialVersionUID;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "SerializableObject{" +
                "serialVersionUID=" + serialVersionUID +
                ", num=" + num +
                '}';
    }
}

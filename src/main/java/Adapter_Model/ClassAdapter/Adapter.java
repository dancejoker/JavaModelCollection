package Adapter_Model.ClassAdapter;

/**
 * 适配器类是本模式的核心。适配器把源接口转换成目标接口。
 * 显然，这一角色不可以是接口，而必须是具体类
 * Created by ddp on 2017/11/12.
 */
public class Adapter extends Source implements Targetable {
    @Override
    public void method2() {
        System.out.println("this is the targetable method!");
    }
}

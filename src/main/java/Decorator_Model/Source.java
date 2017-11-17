package Decorator_Model;

import Adapter_Model.InterfaceAdapter.*;

/**
 * Created by ddp on 2017/11/17.
 */
public class Source implements Sourceable {
    @Override
    public void method() {
        System.out.println("the original method!");
    }
}

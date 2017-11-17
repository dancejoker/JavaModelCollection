package Facade_Mode;

/**
 * 门面角色
 * 外观模式的核心。它被客户角色调用，它熟悉子系统的功能。
 * 内部根据客户角色的需求预定了几种功能的组合。
 * Created by ddp on 2017/11/17.
 */
public class Computer {
    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public Computer() {
        cpu = new CPU();
        memory = new Memory();
        disk = new Disk();
    }
    public void startup(){
        System.out.println("开启电脑");
        cpu.startup();
        memory.startup();
        disk.startup();
        System.out.println("启动电脑完成");
    }

    public void shutdown(){
        System.out.println("开始关闭电脑！");
        cpu.shutdown();
        memory.shutdown();
        disk.shutdown();
    }

}

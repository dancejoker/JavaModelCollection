package CompositeModel.FileSystemDemo;

/**
 * Created by ddp on 2017/11/20.
 */
public class ImagerFile extends File {
    public ImagerFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("这是图像文件，文件名：" + super.getName());
    }
}

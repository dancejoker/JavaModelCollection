package CompositeModel.FileSystemDemo;

/**
 * Created by ddp on 2017/11/20.
 */
public class TextFile extends File {
    public TextFile(String name) {
        super(name);
    }

    @Override
    public void display() {
        System.out.println("这是文本文件，文件名：" + super.getName());
    }
}

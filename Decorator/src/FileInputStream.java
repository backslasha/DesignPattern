/**
 * Component 默认实现类，实现了基本的 read() 方法
 */
public class FileInputStream extends InputStream {
    @Override
    public int read() {
        System.out.print("read a byte; ");
        return 0;
    }
}

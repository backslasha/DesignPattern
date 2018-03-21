
/**
 * 具体装饰者
 */
public class BufferedInputStream extends FilterInputStream {

    protected BufferedInputStream(InputStream in) {
        super(in);
    }

    // 修饰 in 的 read() 方法
    @Override
    public int read() {
        System.out.print("buffer,then ");
        return in.read();
    }

    // 添加新功能
    public long skip(long n) {
        System.out.print("skip " + n + " bytes,then ");
        return 0;
    }
}

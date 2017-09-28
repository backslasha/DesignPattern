
public class FilterInputStream extends InputStream {
    // 持有被装饰者(Component)的引用
    protected InputStream in;

    protected FilterInputStream(InputStream in) {
        this.in = in;
    }

    @Override
    public int read() {
        return in.read();
    }
}

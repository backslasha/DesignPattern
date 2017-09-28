/**
 * 具体装饰类
 */
public class DataInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected DataInputStream(InputStream in) {
        super(in);
    }

    // 添加新功能
    public final int readInt() {
        System.out.print("extract a Int from: ");
        System.out.print("{ ");
        read();
        System.out.print("} * 4");
        return 0;
    }
}

import definition.Adaptee;
import definition.Adapter;
import definition.Target;

public class Client {
    public static void main(String[] args) {
        // 在我们无法修改 Adaptee 的情况下，可以通过适配器模式，来完成接口的对接
        // Target target = new Adaptee(); --> 无法对接上

        Target target = new Adapter(new Adaptee());
        target.request();
    }
}

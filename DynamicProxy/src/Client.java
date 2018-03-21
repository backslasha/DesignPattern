import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        InterfaceImpl anInterface = new InterfaceImpl();
        ProxyHandler proxyHandler = new ProxyHandler(anInterface);

        // 注意只能动态生成 Interface 的代理实例，不是类或者抽象类
        // 调用 proxy 的所有方法，均变成调用 ProxyHandler 的 invoke 方法
        IInterface proxy = (IInterface) Proxy.newProxyInstance(
                anInterface.getClass().getClassLoader(),
                anInterface.getClass().getInterfaces(),
                proxyHandler
        );

        proxy.function();
    }
}

class ProxyHandler implements InvocationHandler {

    // 被代理的对象
    private InterfaceImpl client;

    public ProxyHandler(InterfaceImpl person) {
        this.client = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("====before====");//定义预处理的工作，当然你也可以根据 method 的不同进行不同的预处理工作

        // 调用 prototype 原来的方法
        Object result = method.invoke(client, args);

        System.out.println("====after====");
        return result;
    }
}

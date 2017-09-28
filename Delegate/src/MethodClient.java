import java.lang.reflect.Method;

/**
 * 一个对象包装成 MethodClient 后，添加到 MethodDelegationHandler，可以指定被 MethodDelegationHandler 通知时，自己将会调用哪个方法进行响应
 *  @see MethodDelegationHandler
 */
public class MethodClient {
    //要执行方法的对象
    private Object client;
    //要执行的方法名称
    private String methodName;
    //要执行方法的参数
    private Object[] params;
    //要执行方法的参数类型
    private Class[] paramTypes;

    public MethodClient(Object client, String methodName, Object... args) {
        this.client = client;
        this.methodName = methodName;
        this.params = args;
        contractParamTypes(this.params);
    }

    //根据参数数组生成参数类型数组
    private void contractParamTypes(Object[] params) {
        this.paramTypes = new Class[params.length];
        for (int i = 0; i < params.length; i++) {
            this.paramTypes[i] = params[i].getClass();
        }
    }


    //执行该 对象的该方法
    public void invoke() throws Exception {
        Method method = client.getClass().getMethod(this.methodName, this.paramTypes);
        if (null == method) {
            return;
        }
        method.invoke(this.client, this.params);
    }
}

import java.util.ArrayList;
import java.util.List;

/***
 *  Java 的委托实现类
 *  @see MethodClient
 *  MethodDelegationHandler 可以通知各个对象，进行不同的行为（调用不同的方法）
 */
public class MethodDelegationHandler {
    private List<MethodClient> objects = new ArrayList<>();


    public void addEvent(Object object, String methodName, Object... params) {
        MethodClient event = new MethodClient(object, methodName, params);
        objects.add(event);
    }

    //通知所有的对象执行指定的事件
    public void notifyAllObjects() throws Exception {
        for (MethodClient e : objects) {
            e.invoke();
        }
    }
}

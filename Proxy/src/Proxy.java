/**
 * 持有一个 RealSubject 实体，同时继承自 Subject 以便可以代替 RealSubject
 * 作用，代替 RealSubject 实体执行某个方法，并且在执行方法的前后可以根据情况作另外一些工作
 */
public class Proxy extends Subject {
    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void request() {
        System.out.println("local proxy:");
        subject.request();
    }
}

import difinition.ConcreteObserver;
import difinition.ConcreteSubject;

public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        ConcreteObserver observer1 = new ConcreteObserver();
        ConcreteObserver observer2 = new ConcreteObserver();
        ConcreteObserver observer3 = new ConcreteObserver();

        observer1.subscribe(subject);
        observer3.subscribe(subject);
        observer2.subscribe(subject);

        subject.setState(new Notification());
        subject.notifyObservers();
    }
}

class Notification {
    @Override
    public String toString() {
        return "订阅的！你们都是傻逼！";
    }
}

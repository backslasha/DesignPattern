package difinition;

public class ConcreteObserver implements Observer<Object> {

    @Override
    public void subscribe(Subject<Object> subject) {
        subject.attach(this);
    }

    @Override
    public void unsubscribe(Subject<Object> subject) {
        subject.detach(this);
    }

    @Override
    public void update(Object o) {
        System.out.println("update to " + o.toString());
    }
}

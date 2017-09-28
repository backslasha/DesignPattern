package difinition;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject<Object> {

    private List<Observer<Object>> observers = new ArrayList<>();
    private Object subjectState;

    @Override
    public void attach(Observer<Object> observer) {
        observers.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer<Object> o :
                observers) {
            o.update(getSubjectState() == null ? "Empty Notification." : getSubjectState());
        }
    }

    public void setState(Object state) {
        this.subjectState = state;
    }

    public Object getSubjectState() {
        return this.subjectState;
    }
}

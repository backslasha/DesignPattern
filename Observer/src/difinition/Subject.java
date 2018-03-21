package difinition;


public interface Subject<T> {
    void attach(Observer<T> observer);

    void detach(Observer observer);

    void notifyObservers();
}

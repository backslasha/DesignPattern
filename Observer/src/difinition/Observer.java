package difinition;

interface Observer<T> {
    void subscribe(Subject<T> subject);

    void unsubscribe(Subject<T> subject);

    void update(T t);
}

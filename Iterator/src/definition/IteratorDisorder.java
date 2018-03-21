package definition;

public class IteratorDisorder implements Iterator {
    private ConcreteAggregate aggregate;
    private int current = 0;

    public IteratorDisorder(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
        current = aggregate.getCount()-1;
    }

    @Override
    public Object first() {
        return aggregate.get(0);
    }

    @Override
    public Object next() {
        Object o = null;
        current--;
        if (current >= 0) {
            o = aggregate.get(current);
        }
        return o;
    }

    @Override
    public boolean isDone() {
        return current < 0;
    }

    @Override
    public Object currentItem() {
        return aggregate.get(current);
    }
}

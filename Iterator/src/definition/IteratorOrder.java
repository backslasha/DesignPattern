package definition;

public class IteratorOrder implements Iterator {
    private ConcreteAggregate aggregate;
    private int current = 0;

    public IteratorOrder(ConcreteAggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public Object first() {
        return aggregate.get(0);
    }

    @Override
    public Object next() {
        Object o = null;
        current++;
        if (current < aggregate.getCount() - 1) {
            o = aggregate.get(current);
        }
        return o;
    }

    @Override
    public boolean isDone() {
        return current > aggregate.getCount()-1;
    }

    @Override
    public Object currentItem() {
        return aggregate.get(current);
    }
}

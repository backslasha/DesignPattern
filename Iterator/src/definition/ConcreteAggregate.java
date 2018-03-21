package definition;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate {
    private List<Object> items = new ArrayList<>();

    @Override
    public Iterator createIterator() {
        return new IteratorOrder(this);
    }

    public int getCount() {
        return items.size();
    }

    public Object get(int index) {
        return items.get(index);
    }

    public void add(Object o) {
        items.add(o);
    }
}

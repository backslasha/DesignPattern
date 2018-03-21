package definition;

public class Client {
    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();

        aggregate.add("A");
        aggregate.add("B");
        aggregate.add("C");
        aggregate.add("D");
        aggregate.add("E");
        aggregate.add("F");

        Iterator iterator = new IteratorDisorder(aggregate);

        while(!iterator.isDone()){
            System.out.println(iterator.currentItem()+" 请买车票！");
            iterator.next();
        }


    }
}

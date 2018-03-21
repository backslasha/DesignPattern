public class Client {
    public static void main(String[] args) {
        Director director = new Director();
        Builder productABuilder = new ConcreteBuilder1();
        Builder productBBuilder = new ConcreteBuilder2();

        director.construct(productABuilder);
        Product productA = productABuilder.getResult();
        productA.show();

        director.construct(productBBuilder);
        Product productB = productBBuilder.getResult();
        productB.show();
    }
}

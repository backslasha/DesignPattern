public class ConcreteBuilder1 extends Builder{

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("Part A");
    }

    @Override
    public void buildPartB() {
        product.add("Part B");
    }

    @Override
    public void buildPartC() {
        product.add("Part C");

    }

    @Override
    public void buildPartD() {
        product.add("Part D");

    }

    @Override
    public void buildPartE() {
        product.add("Part E");

    }

    @Override
    public void buildPartF() {
        product.add("Part F");

    }

    @Override
    public Product getResult() {
        return product;
    }
}

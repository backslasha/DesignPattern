public class ConcreteBuilder2 extends Builder{

    private Product product = new Product();

    @Override
    public void buildPartA() {
        product.add("Part X");
    }

    @Override
    public void buildPartB() {
        product.add("Part Y");
    }

    @Override
    public void buildPartC() {
        product.add("Part Z");

    }

    @Override
    public void buildPartD() {
        product.add("Part O");

    }

    @Override
    public void buildPartE() {
        product.add("Part P");

    }

    @Override
    public void buildPartF() {
        product.add("Part Q");

    }

    @Override
    public Product getResult() {
        return product;
    }
}

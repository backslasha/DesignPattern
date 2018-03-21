public class ProductAFactory implements Factory{
    @Override
    public Product create() {
        return new ProductA();
    }
}

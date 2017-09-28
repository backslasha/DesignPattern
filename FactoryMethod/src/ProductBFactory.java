public class ProductBFactory implements Factory{
    @Override
    public Product create() {
        return new ProductB();
    }
}

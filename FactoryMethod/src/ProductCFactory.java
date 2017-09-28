public class ProductCFactory implements Factory{
    @Override
    public Product create() {
        return new ProductC();
    }
}

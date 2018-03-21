package definition.z_factory;

import definition.AbstractFactory;
import definition.AbstractProduct_001;
import definition.AbstractProduct_002;
import definition.AbstractProduct_003;

public class ConcreteFactoryZ extends AbstractFactory {

    @Override
    public AbstractProduct_001 createProduct_001() {
        return new Product_Z_001();
    }

    @Override
    public AbstractProduct_002 createProduct_002() {
        return new Product_Z_002();
    }

    @Override
    public AbstractProduct_003 createProduct_003() {
        return new Product_Z_003();
    }
}

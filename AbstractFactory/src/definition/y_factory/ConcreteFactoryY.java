package definition.y_factory;

import definition.AbstractFactory;
import definition.AbstractProduct_001;
import definition.AbstractProduct_002;
import definition.AbstractProduct_003;

public class ConcreteFactoryY extends AbstractFactory {

    @Override
    public AbstractProduct_001 createProduct_001() {
        return new Product_Y_001();
    }

    @Override
    public AbstractProduct_002 createProduct_002() {
        try {
            throw new Exception("So sorry! Factory Y cannot generate 003 Product temporarily!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public AbstractProduct_003 createProduct_003() {
        return new Product_Y_003();
    }
}

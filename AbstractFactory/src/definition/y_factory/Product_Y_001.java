package definition.y_factory;

import definition.AbstractProduct_001;

public class Product_Y_001 implements AbstractProduct_001 {
    private String typeSpecification = getClass().getSimpleName();

    public String getTypeSpecification() {
        return typeSpecification;
    }
}

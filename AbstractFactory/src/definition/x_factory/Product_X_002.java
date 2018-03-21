package definition.x_factory;

import definition.AbstractProduct_002;

public class Product_X_002 implements AbstractProduct_002 {
    private String typeSpecification = getClass().getSimpleName();

    public String getTypeSpecification() {
        return typeSpecification;
    }
}

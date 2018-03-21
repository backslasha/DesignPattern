package definition.z_factory;

import definition.AbstractProduct_003;

public class Product_Z_003 implements AbstractProduct_003 {
    private String typeSpecification = getClass().getSimpleName();

    public String getTypeSpecification() {
        return typeSpecification;
    }
}

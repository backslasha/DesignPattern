package example.phone_criterion;

public class OutOfStock extends Phone{

    @Override
    public String getSpecification() {
        return "we are sorry! this phone is out of stock temporarily!";
    }
}

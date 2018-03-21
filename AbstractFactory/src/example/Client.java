package example;

import example.meizu.MeizuFactory;
import example.phone_criterion.ThousandPhone;

public class Client {
    public static void main(String[] args) {
        ThousandPhone thousandPhone = (ThousandPhone) new MeizuFactory().createThousandPhone();
        System.out.println(thousandPhone.getClass().getSimpleName() + " : " + thousandPhone.getSpecification());
    }
}

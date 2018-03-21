package pro;

import example.phone_criterion.ThousandPhone;

public class Client {
    public static void main(String[] args) {
        ThousandPhone thousandPhone = PhoneAccess.getThousandPhone();
        System.out.println(thousandPhone.getClass().getSimpleName() + " : " + thousandPhone.getSpecification());
    }
}

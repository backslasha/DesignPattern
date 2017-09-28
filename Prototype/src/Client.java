import prototype.ConcretePrototypeA;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePrototypeA prototype = new ConcretePrototypeA("prototype.ConcretePrototypeA");
        prototype.show();

        ConcretePrototypeA prototypeACopy = (ConcretePrototypeA) prototype.clone();
        prototypeACopy.show();

        System.out.println(prototype == prototypeACopy);//false
        System.out.println(prototype.mString == prototypeACopy.mString);//true
    }
}

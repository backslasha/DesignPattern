package prototype;

public class ConcretePrototypeA extends Prototype {
    public String mString;

    public ConcretePrototypeA(String mString) {
        this.mString = mString;
    }

    public void show() {
        System.out.println(getClass().getSimpleName() + ": mString is " + mString);
    }

}

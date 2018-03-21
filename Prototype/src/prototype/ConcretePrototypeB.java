package prototype;

public class ConcretePrototypeB extends Prototype {
    private String mString;

    public ConcretePrototypeB(String mString) {
        this.mString = mString;
    }

    public void show() {
        System.out.println(getClass().getSimpleName() + ": mString is " + mString);
    }
}

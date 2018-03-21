package definition;

public class Adapter extends Target {
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    private Adaptee adaptee;

    @Override
    public void request() {
        adaptee.incompatibleRequest();
    }
}

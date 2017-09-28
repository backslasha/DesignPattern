package definition;

public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        getOriginComponent().operation();
        System.out.print(" 附加功能B ");
    }

    public void plusFunction(){
        System.out.print(" B_plus功能 ");
    }
}

package definition;

public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        getOriginComponent().operation();
        System.out.print(" 附加功能A ");
    }
}

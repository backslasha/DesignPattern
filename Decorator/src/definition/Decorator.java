package definition;

public abstract class Decorator extends Component {
    private Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    Component getOriginComponent() {
        return component;
    }
}

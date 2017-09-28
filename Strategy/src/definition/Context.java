package definition;

public class Context {
    Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void useStrategy(){
        strategy.algorithmInterface();
    }
}

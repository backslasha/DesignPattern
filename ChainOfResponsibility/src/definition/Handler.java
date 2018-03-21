package definition;

public abstract class Handler {
    abstract void setSuccessor(Handler successor);
    abstract void handlerRequest(int request);
}

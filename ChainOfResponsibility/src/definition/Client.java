package definition;

public class Client {
    public static void main(String[] args) {
        int request  = 37;
        Handler handler = new LowLevelHandler();
        Handler handler1 = new MiddleLevelHandler();
        handler.setSuccessor(handler1);
        handler1.setSuccessor(new HighLevelHandler());
        handler.handlerRequest(request);
    }
}

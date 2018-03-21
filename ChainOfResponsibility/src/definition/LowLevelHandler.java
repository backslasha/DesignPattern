package definition;

public class LowLevelHandler extends Handler {
    private Handler successor;

    @Override
    void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    @Override
    void handlerRequest(int request) {
        if (shouldConsumeRequest(request)) {
            System.out.println("Request \"" + request + "\" was finally consumed by " + getClass().getSimpleName() + ".");
        } else {
            if (successor == null) {
                System.out.println(getClass().getSimpleName() + " can not handle the request \"" + request + "\" and there is no successor, the request will be dropped.");
            } else {
                System.out.print(getClass().getSimpleName() + " -> " + successor.getClass().getSimpleName());
                successor.handlerRequest(request);
            }
        }
    }

    private boolean shouldConsumeRequest(int request) {
        return request <= 10;
    }


}

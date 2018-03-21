package definition;

public class HighLevelHandler extends Handler {
    private Handler successor;

    @Override
    void setSuccessor(Handler successor) {
        this.successor = successor;
    }


    @Override
    void handlerRequest(int request) {
        if (shouldConsumeRequest(request)) {
            System.out.println("\n"+"Request \"" + request + "\" was finally consumed by " + getClass().getSimpleName() + ".");
        } else {
            if (successor == null) {
                System.out.println("\n"+getClass().getSimpleName() + " can not handle the request \"" + request + "\" and there is no successor, the request will be dropped.");
            } else {
                System.out.println(" -> " + successor.getClass().getSimpleName());
                successor.handlerRequest(request);
            }
        }
    }

    private boolean shouldConsumeRequest(int request) {
        return request <= 30;
    }


}

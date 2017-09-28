public class OperationDiv extends Operation {

    @Override
    String getResult(double a, double b) {
        String result;
        if (b == 0)
            result = "Divisor cannot be 0!";
        else
            result = String.valueOf(a / b);
        return result;
    }
}

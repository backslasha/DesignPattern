import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        try {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Please input num A:");

            double a = scanner.nextDouble();

            System.out.println("Please choose the operation:");

            String operationStr = scanner.next();

            System.out.println("Please input num B:");

            double b = scanner.nextDouble();

            Operation operation = OperationFactory.create(operationStr);

            System.out.println("The result is: " + operation.getResult(a,b));

        } catch (Exception e) {
            System.out.println("Input error!");
        }
    }
}

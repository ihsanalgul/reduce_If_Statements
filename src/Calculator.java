import fourthSolution.Command;
import secondSolution.Operation;
import secondSolution.OperationFactory;

import static org.junit.Assert.assertEquals;

public class Calculator {

    public static void main(String[] args) {
        /*
        problematic if statements in basic calculate method
         */
        System.out.println(" The problematic if statements in basic calculate method ");
        new Calculator().calculate(2, 3, "add");
        System.out.println(" =================================== ");


        String operation = "multiply";
        System.out.println("operation = " + operation);
        int resultCalculateUsingFactory = new Calculator().calculateUsingFactory(2, 3, operation);
        System.out.println("resultCalculateUsingFactory = " + resultCalculateUsingFactory);
        System.out.println(" =================================== ");

    }

    public int calculateUsingCommandPattern(Command command) {
        return command.execute();
    }

    public int calculateUsingEnum(int a, int b, thirdSolution.Operation operation) {
        return operation.apply(a, b);
    }

    public int calculateUsingFactory(int a, int b, String operation) {
        Operation targetOperation = OperationFactory
                .getOperation(operation)
                .orElseThrow(() -> new IllegalArgumentException("Illegal operation"));
        return targetOperation.apply(a, b);
    }

    public int calculate(int a, int b, String operation) {
        int result = Integer.MIN_VALUE;

        if (operation.equals("add")) {
            result = a + b;
        } else if (operation.equals("subtract")) {
            result = a - b;
        } else if (operation.equals("multiply")) {
            result = a * b;
        } else if (operation.equals("divide")) {
            result = a / b;
        }

        System.out.println("a = " + a + ", b = " + b + ", operation = " + operation + "\n" + "result: " + result);
        return result;
    }
}

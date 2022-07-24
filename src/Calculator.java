import secondSolution.Operation;
import secondSolution.OperationFactory;

public class Calculator {

    public static void main(String[] args) {
        /*
        problematic if statements in basic calculate method
         */
        System.out.println(" The problematic if statements in basic calculate method ");
        new Calculator().calculate(2, 3, "add");
        System.out.println(" =================================== ");


        /*
        1st solution of reducing if st.s in calculate method
         */
        System.out.println(" 1st solution for reducing if st.s in calculate method\n ");
        String operation = "add";
        int resultCalculateUsingFactory = new Calculator().calculateUsingFactory(2, 3, operation);
        System.out.println("operation = " + operation);
        System.out.println("resultCalculateUsingFactory = " + resultCalculateUsingFactory);
        System.out.println(" =================================== ");

        operation="multiply";
        System.out.println("operation = " + operation);
        resultCalculateUsingFactory = new Calculator().calculateUsingFactory(2,3,operation);
        System.out.println("resultCalculateUsingFactory = " + resultCalculateUsingFactory);
        System.out.println(" =================================== ");


    }

    private int calculateUsingFactory(int a, int b, String operation) {
        Operation targetOperation = OperationFactory
                .getOperation(operation)
                .orElseThrow(() -> new IllegalArgumentException("Illegal operation"));
        return targetOperation.apply(a, b);
    }

    private int calculate(int a, int b, String operation) {
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

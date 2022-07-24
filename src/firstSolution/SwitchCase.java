package firstSolution;

public class SwitchCase {
    /*
    Let's explore the alternate options to replace
    the complex if statements above into much simpler and manageable code.
     */

    public int calculateWithSwitchCase(int a, int b, String operation) {
        int result = Integer.MIN_VALUE;

        switch (operation) {
            case "add":
                result = a + b;
                break;

            case "subtract":
                result = a - b;
                break;
            case "multiply":
                result = a * b;
                break;

            case "divide":
                result = a / b;
                break;
        }

        return result;

    }
}

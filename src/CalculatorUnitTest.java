import static org.junit.Assert.*;

import fourthSolution.commands.AddCommand;
import fourthSolution.commands.DivideCommand;
import fourthSolution.commands.MultiplyCommand;
import fourthSolution.commands.SubtractCommand;
import org.junit.Test;
import thirdSolution.Operation;

public class CalculatorUnitTest {


    @Test
    public void whenCalculatorUsingStringOperator_thenReturnCorrectResult() {
        int result = new Calculator().calculate(3, 4, "add");
        assertEquals(7, result);
    }


    @Test
    public void whenCalculatorUsingFactory_thenReturnCorrectResult() {
        /*
        1st solution of reducing if st.s in calculate method
         */
        System.out.println(" 1st solution for reducing if st.s in calculate method by using Factory Pattern\n ");
        String operation = "add";
        int resultCalculateUsingFactory = new Calculator().calculateUsingFactory(2, 3, operation);
        assertEquals(5, resultCalculateUsingFactory);
    }


    @Test
    public void whenCalculateUsingEnumOperator_thenReturnCorrectResult() {
        /*
        2nd solution of reducing if st.s in calculate method
         */
        System.out.println(" 2nd solution of reducing if st.s in calculate method by using Enum\n ");
        Operation operation = Operation.ADD;
        System.out.println("operation = " + operation);
        int resultCalculateUsingEnum = new Calculator().calculateUsingEnum(2, 3, operation);
        assertEquals(5, resultCalculateUsingEnum);
        System.out.println("resultCalculateUsingEnum = " + resultCalculateUsingEnum);
        System.out.println(" =================================== ");
    }


    @Test
    public void whenCalculatingUsingCommandPattern_thenReturnCorrectResult() {
        Calculator calculator = new Calculator();

        // Add
        int result = calculator.calculateUsingCommandPattern(new AddCommand(3, 4));
        assertEquals(7, result);

        //Multiply
        result = calculator.calculateUsingCommandPattern(new MultiplyCommand(3, 4));
        assertEquals(12, result);

        //Subtract
        result = calculator.calculateUsingCommandPattern(new SubtractCommand(5, 4));
        assertEquals(1, result);

        //Divide
        result = calculator.calculateUsingCommandPattern(new DivideCommand(12, 4));
        assertEquals(3, result);
    }

}

package secondSolution;

/*
We'll now implement a factory class which returns instances of Operation based on the given operator:


 */

import secondSolution.op.Addition;
import secondSolution.op.Division;
import secondSolution.op.Multiplication;
import secondSolution.op.Subtraction;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OperationFactory {

    static Map<String, Operation> operationMap = new HashMap<>();

    static {
        operationMap.put("add", new Addition());
        operationMap.put("subtract", new Subtraction());
        operationMap.put("multiply", new Multiplication());
        operationMap.put("division", new Division());
    }

    public static Optional<Operation> getOperation(String operator) {
        return Optional.ofNullable(operationMap.get(operator));
    }
}

package secondSolution.op;

import secondSolution.Operation;

public class Division implements Operation {
    @Override
    public int apply(int a, int b) {
        return a / b;
    }
}

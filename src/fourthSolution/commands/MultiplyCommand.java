package fourthSolution.commands;

import fourthSolution.Command;

public class MultiplyCommand implements Command {

    int a;
    int b;

    public MultiplyCommand(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer execute() {
        return a * b;
    }
}

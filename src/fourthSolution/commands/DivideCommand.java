package fourthSolution.commands;

import fourthSolution.Command;

public class DivideCommand implements Command {

    int a;
    int b;

    public DivideCommand(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer execute() {
        return a / b;
    }
}

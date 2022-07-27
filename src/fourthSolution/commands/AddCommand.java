package fourthSolution.commands;

import fourthSolution.Command;

public class AddCommand implements Command {

    int a;
    int b;

    public AddCommand(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public Integer execute() {
        return a + b;
    }
}

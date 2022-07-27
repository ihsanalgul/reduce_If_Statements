package thirdSolution;

/*
In addition to the use of Map, we can also use Enum to label particular business logic.
After that, we can use them either in the nested if statements or switch case statements.
Alternatively, we can also use them as a factory of objects and do more strategic them to perform the related business logic.

That would reduce the number of nested if statements as well and delegate the responsibility to individual Enum values.
 */
public enum Operation {
    /*ADD,
    SUBTRACT,
    MULTIPLY,
    DIVIDE;*/

    ADD {
        public int apply(int a, int b) {
            return a + b;
        }
    },
    SUBTRACT {
        public int apply(int a, int b) {
            return a - b;
        }
    },
    MULTIPLY {
        public int apply(int a, int b) {
            return a * b;
        }
    },
    DIVIDE {
        public int apply(int a, int b) {
            return a / b;
        }
    };

    public abstract int apply(int a, int b);

}




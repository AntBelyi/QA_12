package hw_12.Task_1;

public class Calculator {
    public enum mathematicalOperation {
        PLUS("+"),
        MINUS("-"),
        MULTIPLY("*"),
        DIVIDE("/");
        private String symbol;

        mathematicalOperation(String symbol) {
            this.symbol = symbol;
        }

        public String getSymbol() {
            return symbol;
        }

    }

    public static double calculator(double first, double second, String operator) throws DivisionByZero, OperationError {
        switch (operator) {
            case "+":
                return first + second;
            case "-":
                return first - second;
            case "*":
                return first * second;
            case "/":
                if (second == 0) {
                    throw new DivisionByZero("Second number zero. It's wrong");
                }
                return first / second;
            default:
                throw new OperationError("Unknown operator " + operator);
        }
    }


}
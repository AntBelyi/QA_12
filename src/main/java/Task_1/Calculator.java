// Calculator.java
public class Calculator {

    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Помилка: Ділення на нуль неможливе!");
        }
        return a / b;
    }
}
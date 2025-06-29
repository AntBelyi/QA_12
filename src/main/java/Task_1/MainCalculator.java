import java.util.InputMismatchException;
import java.util.Scanner;

public class MainCalculator {

    public static double getNumericInput(Scanner scanner, String prompt) throws NonNumericInputException, UnknownCalculatorException {
        while (true) {
            System.out.print(prompt);
            try {
                return scanner.nextDouble();
            } catch (InputMismatchException e) {
                scanner.next(); // Consume the invalid input
                throw new NonNumericInputException("Error: You entered a non-numeric value. Please try again.");
            } catch (Exception e) {
                throw new UnknownCalculatorException("An unknown error occurred while entering a number.");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        while (true) {
            System.out.println("\n--- Simple Calculator ---");
            System.out.println("Choose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Exit");

            System.out.print("Your choice (1/2/3/4/5): ");
            String choice = scanner.next();

            if (choice.equals("5")) {
                System.out.println("Thank you for using the calculator!");
                break;
            }

            if (!choice.matches("[1-4]")) {
                System.out.println("Invalid operation choice. Please try again.");
                continue;
            }

            try {
                double num1 = getNumericInput(scanner, "Enter the first number: ");
                double num2 = getNumericInput(scanner, "Enter the second number: ");

                double result = 0;
                String operationSymbol = "";

                switch (choice) {
                    case "1":
                        result = calculator.add(num1, num2);
                        operationSymbol = "+";
                        break;
                    case "2":
                        result = calculator.subtract(num1, num2);
                        operationSymbol = "-";
                        break;
                    case "3":
                        result = calculator.multiply(num1, num2);
                        operationSymbol = "*";
                        break;
                    case "4":
                        result = calculator.divide(num1, num2);
                        operationSymbol = "/";
                        break;
                }
                System.out.printf("Result: %.2f %s %.2f = %.2f%n", num1, operationSymbol, num2, result);

            } catch (DivisionByZeroException e) {
                System.out.println(e.getMessage());
            } catch (NonNumericInputException | UnknownCalculatorException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("An unknown error occurred.");
                e.printStackTrace(); // For debugging, can be removed in the final version
            }
        }
        scanner.close();
    }
}
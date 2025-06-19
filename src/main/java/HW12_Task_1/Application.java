package HW12_Task_1;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calc = new Calculator();

        while (true) {
            try {
                System.out.print("Enter the first number:");
                String number1 = scanner.nextLine();

                double num1;
                try {
                    num1 = Double.parseDouble(number1);
                } catch (NumberFormatException e) {
                    throw new NotANumberException("Error:you entered a non-numeric value.Try again.");
                }
                if (number1.equalsIgnoreCase("Exit")) {
                    break;
                }

                    System.out.print("Choose an operation (+, -, *, /): ");
                    String operation = scanner.nextLine();

                    System.out.print("Enter the second number:");
                    String number2 = scanner.nextLine();

                    double num2;
                    try {
                        num2 = Double.parseDouble(number2);
                    } catch (NumberFormatException e) {
                        throw new NotANumberException("Error:you entered a non-numeric value.Try again.");
                    }

                    double result;

                    switch (operation) {
                        case "+":
                            result = calc.add(num1, num2);
                            break;
                        case "-":
                            result = calc.subtract(num1, num2);
                            break;
                        case "*":
                            result = calc.multiply(num1, num2);
                            break;
                        case "/":
                            if (num2 == 0.0) {
                                throw new DivisionByZeroException("Error: Division by zero is not allowed.");
                            }
                            result = calc.divide(num1, num2);
                            break;
                        default:
                            throw new UnknownCalculatorException("An unknown error occurred");
                    }

                    System.out.println(result);

                } catch(DivisionByZeroException e){
                    System.out.println(e.getMessage());
                } catch(NotANumberException e){
                    System.out.println(e.getMessage());
                } catch(UnknownCalculatorException e){
                    System.out.println(e.getMessage());
                } catch(Exception e){
                    System.out.println("An unknown error occurred");
                }

                System.out.print("Do you want to continue?(yes/no):");
                String answer = scanner.nextLine();
                if (answer.equalsIgnoreCase("yes")) {
                } else {
                    System.out.println("Program completion.");
                    break;
                }
            }
        scanner.close();
    }

    private static boolean isNumeric(String str) {
        return Pattern.matches("-?\\d+(\\.\\d+)?", str);
    }
}
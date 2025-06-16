package hw_12.Task_1;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator cal = new Calculator();

        while (true) {
            try {
                System.out.println("Exit- enter (exit) or next action - enter (next)");
                String action = scanner.nextLine();
                if (action.equals("exit")) break;
                else if (action.equals("next")) {
                    System.out.println("Enter first number");
                    String firstValue = scanner.nextLine();
                    System.out.println("Enter plus (+) or minus(-) or multiply(*) or divide(/)");
                    String operator = scanner.nextLine();
                    System.out.println("Enter second number");
                    String secondValue = scanner.nextLine();
                    try {
                        double firstNumber = Double.parseDouble(firstValue);
                        double secondNumber = Double.parseDouble(secondValue);
                        double result = cal.calculator(firstNumber, secondNumber, operator);
                        System.out.println(result);
                    } catch (NumberFormatException ex) {
                        throw new ValueError("You need to enter number");
                    }

                } else throw new IllegalArgumentException("Wrong action. You can write only next or exit");

            } catch (ValueError ex) {
                System.out.println("" + ex.getMessage());
            } catch (Exception exception){
                System.out.println("!!!!!" + exception.getMessage());
            }

        }

        scanner.close();
    }
}
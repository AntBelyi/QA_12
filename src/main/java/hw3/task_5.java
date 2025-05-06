package hw3;

import java.util.Scanner;

public class task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        int a = scanner.nextInt();

        System.out.print("Введіть друге число: ");
        int b = scanner.nextInt();

        System.out.print("Введіть оператор (+, -, *, /, %): ");
        char operator = scanner.next().charAt(0);

        int result = (operator == '+') ? (a + b) :
                (operator == '-') ? (a - b) :
                        (operator == '*') ? (a * b) :
                                (operator == '/') ? (b != 0 ? a / b : 0) :
                                        (operator == '%') ? (b != 0 ? a % b : 0) :
                                                0;

        System.out.println("Результат: " + result);
    }
}

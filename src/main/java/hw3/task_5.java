package hw3;

import java.util.Scanner;

public class task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        answerCorrect(scanner);
        scanner.close();
    }
    public static void answerCorrect(Scanner scanner){

        System.out.print("Введіть два числа:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Введіть якесь значення: +,-,*,/,%");
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
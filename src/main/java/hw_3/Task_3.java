package hw_3;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int answer = differenceTwoNumbers(scanner);

        System.out.println(answer);

        scanner.close();
    }

    public static int differenceTwoNumbers(Scanner scanner) {
        System.out.println("Enter two numbers :");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int result = a > b ? a - b : b - a;
        return result;
    }
}

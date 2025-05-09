package hw_3;

import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int w = rightResult(scanner);
        System.out.println(w);

        int a = secondRightResult(scanner);
        System.out.println(a);

        scanner.close();
    }

    public static int rightResult(Scanner scanner) {
        System.out.println("Enter char :");
        String ch = scanner.next();
        System.out.println("Enter two numbers :");
        int oneNumber = scanner.nextInt();
        int twoNumber = scanner.nextInt();
        int two;
        if (ch.equals("+")) {
            return oneNumber + twoNumber;
        } else if (ch.equals("-")) {
            return oneNumber - twoNumber;
        } else if (ch.equals("%")) {
            return oneNumber % twoNumber;
        } else if (ch.equals("/")) {
            return oneNumber / twoNumber;
        } else if (ch.equals("*")) {
            return oneNumber * twoNumber;
        } else {
            return 0;
        }
    }

    public static int secondRightResult(Scanner scanner) {
        System.out.println("Enter char :");
        String ch = scanner.next();
        System.out.println("Enter two numbers :");
        int oneNumber = scanner.nextInt();
        int twoNumber = scanner.nextInt();
        return ch.equals("+") ? (oneNumber + twoNumber) : ch.equals("-") ? (oneNumber - twoNumber) : ch.equals("%") ? (oneNumber % twoNumber) : ch.equals("/") ? (oneNumber / twoNumber) : ch.equals("*") ? (oneNumber/ twoNumber) : 0;
    }
}

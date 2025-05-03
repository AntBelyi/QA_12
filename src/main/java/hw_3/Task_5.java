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
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        if (ch.equals("+")) {
            return one + two;
        } else if (ch.equals("-")) {
            return one - two;
        } else if (ch.equals("%")) {
            return one % two;
        } else if (ch.equals("/")) {
            return one / two;
        } else if (ch.equals("*")) {
            return one * two;
        } else {
            return 0;
        }
    }

    public static int secondRightResult(Scanner scanner) {
        System.out.println("Enter char :");
        String ch = scanner.next();
        System.out.println("Enter two numbers :");
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        return ch.equals("+") ? (b + c) : ch.equals("-") ? (b - c) : ch.equals("%") ? (b % c) : ch.equals("/") ? (b / c) : ch.equals("*") ? (b / c) : 0;
    }
}

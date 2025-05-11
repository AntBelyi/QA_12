package hw3;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int answer = difference(scanner);

        System.out.println("Різниця = " + answer);
        scanner.close();
    }
    public static int difference(Scanner scanner) {
        System.out.print("Введіть перше число: ");
        int a = scanner.nextInt();

        System.out.print("Введіть друге число: ");
        int b = scanner.nextInt();

        int result = (a > b) ? (a - b) : (b - a);
        return result;
    }
}
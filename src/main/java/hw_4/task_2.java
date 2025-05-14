package hw_4;

import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число: ");
        String input = scanner.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equals(reversed)) {
            System.out.println("Число є паліндромом.");
        } else {
            System.out.println("Число не є паліндромом.");
            scanner.close();
        }
    }
}
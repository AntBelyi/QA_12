package hw4;

import java.util.Random;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();

        System.out.print("Generated array: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to search: ");
        int userNumber = scanner.nextInt();

        boolean found = false;
        for (int number : numbers) {
            if (number == userNumber) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("The number is in the array.");
        } else {
            System.out.println("The number is not in the array.");
        }
    }
}

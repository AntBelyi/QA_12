package hw_4;

import java.util.Random;
import java.util.Scanner;

public class task_5 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();

        System.out.print("Масив: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(50) + 1;
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число для перевірки: ");
        int userNumber = scanner.nextInt();

        boolean found = false;
        for (int number : numbers) {
            if (number == userNumber) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Число є в масиві.");
        } else {
            System.out.println("Числа немає в масиві.");
            scanner.close();
        }
    }
}
package hw4;

import java.util.Random;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();

        // Заповнення масиву випадковими числами від 0 до 99
        System.out.print("Згенерований масив: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100); // від 0 до 99
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Введення числа користувачем
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть число для пошуку: ");
        int userNumber = scanner.nextInt();

        // Перевірка, чи є число у масиві
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
        }
    }
}

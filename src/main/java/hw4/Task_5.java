package hw4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Ввидите число до 100");
        int val = scanner.nextInt();
        boolean foud = false;
        for (int num : numbers) {
            if (num == val) {
                foud = true;
                break;
            }
        }
        if (foud) {
            System.out.println(" Число в массиве " + foud);
        } else {
            System.out.println(" Число в массиве " + foud);
        }
        scanner.close();
    }
}

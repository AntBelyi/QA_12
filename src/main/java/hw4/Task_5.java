package hw4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int[] numbers = new int[45];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101)-50;
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println("Enter a number up to 100");
        int val = scanner.nextInt();
        boolean foud = false;
        for (int num : numbers) {
            if (num == val) {
                foud = true;
                break;
            }
        }
        if (foud) {
            System.out.println(" Number in array " + foud);
        } else {
            System.out.println("Number in array " + foud);
        }
        scanner.close();
    }
}

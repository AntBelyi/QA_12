package hw_4;

import java.util.Random;

public class task_6 {
    public static void main(String[] args) {
        int[] array = new int[45];
        Random random = new Random();

        System.out.print("Масив: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101) - 50;
            System.out.print(array[i] + " ");
        }
        System.out.println();

        int min = array[0];
        int max = array[0];

        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Мінімальне значення в масиві: " + min);
        System.out.println("Максимальне значення в масиві: " + max);
    }
}
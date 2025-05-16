package hw4;

import java.util.Random;

public class Task_6 {
    public static void main(String[] args) {

        int[] numbers = new int[100];
        Random random = new Random();
        for (int i =0;i<numbers.length;i++){

        }
        int min = 0;
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } else if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println(max + "-max" + "///" + "(" + min + ")" + "min");
    }
}

package hw4;

public class Task_6 {
    public static void main(String[] args) {

        int[] numbers = {10, 5, -5, 6, 15, -23, 50, -17, 20, -3, 32, 18, 2, -50, 24, -42, 7, 6, 4, 11, -36, 36, -42, 42, 28, -28, 8, -8, 9, -9, 12, -12, -13, 13, 6, 4, 2, 4, 47, 49, -4, 6, 1, 3, 9, 11, 12, 14};
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

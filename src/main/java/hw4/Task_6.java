import java.util.Random;

public class Task_6 {
    public static void main(String[] args) {
        int[] numbers = new int[45];
        Random random = new Random();

        int min = 51;
        int max = -51;

        System.out.print("Array: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101) - 50;
            System.out.print(numbers[i] + " ");

            if (numbers[i] < min) min = numbers[i];
            if (numbers[i] > max) max = numbers[i];
        }

        System.out.println("\nMinimum element: " + min);
        System.out.println("Maximum element: " + max);
    }
}

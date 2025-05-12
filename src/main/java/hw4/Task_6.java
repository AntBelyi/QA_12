import java.util.Random;

public class Task_6git  {
    public static void main(String[] args) {
        int[] numbers = new int[45];
        Random random = new Random();

        int min = 51;   // більше за можливий максимум
        int max = -51;  // менше за можливий мінімум

        System.out.print("Масив: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(101) - 50; // діапазон [-50, 50]
            System.out.print(numbers[i] + " ");

            if (numbers[i] < min) min = numbers[i];
            if (numbers[i] > max) max = numbers[i];
        }

        System.out.println("\nМінімальний елемент: " + min);
        System.out.println("Максимальний елемент: " + max);
    }
}

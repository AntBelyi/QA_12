import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть максимальну вагу складу: ");
        int maxCapacity = scanner.nextInt();
        int currentCapacity = maxCapacity;

        while (currentCapacity > 0) {
            System.out.print("Введіть вагу металу для здачі: ");
            int metalWeight = scanner.nextInt();

            if (metalWeight < 5) {
                System.out.println("Неможливо прийняти таку малу вагу. Мінімальна вага — 5 кг.");
                continue;
            }

            if (metalWeight > currentCapacity) {
                System.out.println("Недостатньо місця на складі для цієї кількості металу.");
                continue;
            }

            currentCapacity -= metalWeight;
            System.out.println("Метал прийнято. Залишилося місця: " + currentCapacity + " кг.");
        }

        System.out.println("Склад заповнений. Прийом металу завершено.");
    }
}

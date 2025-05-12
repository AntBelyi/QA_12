package hw_4;

import java.util.Scanner;

public class task_3{
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Введіть максимальну вагу, яку може зберігати склад: ");
                int maxCapacity = scanner.nextInt();
                int remainingCapacity = maxCapacity;

                while (remainingCapacity > 0) {
                    System.out.print("Введіть вагу металу для здачі: ");
                    int weight = scanner.nextInt();

                    if (weight < 5) {
                        System.out.println("Неможливо прийняти таку малу вагу (менше 5 кг).");
                    } else if (weight > remainingCapacity) {
                        System.out.println("Недостатньо місця на складі. Залишилось: " + remainingCapacity + " кг.");
                    } else {
                        remainingCapacity -= weight;
                        System.out.println("Метал прийнято. Залишилось місця: " + remainingCapacity + " кг.");
                    }
                }
                System.out.println("Склад заповнено. Програма завершена.");
                scanner.close();
    }
}
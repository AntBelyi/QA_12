package hw4;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter warehouse maximum capacity: ");
        int maxCapacity = scanner.nextInt();
        int currentCapacity = maxCapacity;

        while (currentCapacity > 0) {
            System.out.print("Enter the weight of the metal to deposit: ");
            int metalWeight = scanner.nextInt();

            if (metalWeight < 5) {
                System.out.println("Cannot accept such a small weight. Minimum is 5 kg.");
                continue;
            }

            if (metalWeight > currentCapacity) {
                System.out.println("Not enough space in the warehouse for this amount of metal.");
                continue;
            }

            currentCapacity -= metalWeight;
            System.out.println("Metal accepted. Remaining space: " + currentCapacity + " kg.");
        }

        System.out.println("Warehouse is full. Metal reception is over.");
    }
}

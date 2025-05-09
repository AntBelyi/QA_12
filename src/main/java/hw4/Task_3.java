package hw4;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter kg space :");
        int kgPlace = scanner.nextInt();
        int order = 0;
        int notOrder = 5;

        while (order < kgPlace) {
            int freePlace = kgPlace - order;
            System.out.println("Enter kg give away ");
            int kgGiveAway = scanner.nextInt();
            if (kgGiveAway <= notOrder) {
                System.out.println("You don't give kg (5 kg)");
                continue;
            }
            if (freePlace < kgGiveAway) {
                System.out.println("little space ");
                continue;
            }
            order = order + kgGiveAway;
        }
        System.out.println("The space is full");
        scanner.close();
    }
}

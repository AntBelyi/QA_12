package hw3;

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        daysWeek(scanner);
        scanner.close();
    }

    public static void daysWeek(Scanner scanner) {
        System.out.print("Введіть число (від 1 до 7): ");
        int day = scanner.nextInt();

        if (day == 1) {
            System.out.println("Понеділок");
        } else if (day == 2) {
            System.out.println("Вівторок");
        } else if (day == 3) {
            System.out.println("Середа");
        } else if (day == 4) {
            System.out.println("Четвер");
        } else if (day == 5) {
            System.out.println("П’ятниця");
        } else if (day == 6) {
            System.out.println("Субота");
        } else if (day == 7) {
            System.out.println("Неділя");
        } else {
            System.out.println("Краще б сьогодні була п’ятниця");
        }
    }
}
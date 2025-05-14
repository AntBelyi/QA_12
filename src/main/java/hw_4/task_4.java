package hw_4;

import java.util.Scanner;

public class task_4 {
    public static void main(String[] args) {
        String[] names = {"Петя", "Маша", "Олена", "Федя", "Саша", "Антон", "Гліб"};
        int[] times = {10, 12, 14, 16, 18, 20};
        String[] places = {"школу", "магазин", "церква", "тренажерний зал", "кіно", "поліклініку"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть три індекси через пробіл (ім’я, час, місце): ");
        int nameIndex = scanner.nextInt();
        int timeIndex = scanner.nextInt();
        int placeIndex = scanner.nextInt();

        if (nameIndex >= 0 && nameIndex < names.length &&
                timeIndex >= 0 && timeIndex < times.length &&
                placeIndex >= 0 && placeIndex < places.length) {

            String result = names[nameIndex] + " йтиме в " + places[placeIndex] + " о " + times[timeIndex] + ":00";
            System.out.println(result);
        } else {
            System.out.println("Введені індекси виходять за межі масивів. Спробуйте ще раз.");
            scanner.close();
        }
    }
}
package hw4;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        String[] names = {"Петя", "Маша", "Олена", "Федя", "Саша", "Антон", "Гліб"};
        int[] times = {10, 12, 14, 16, 18, 20};
        String[] places = {"школу", "магазин", "церква", "тренажерний зал", "кіно", "поліклініку"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть індекси для імені, місця і часу (через пробіл):");
        int nameIndex = scanner.nextInt();
        int placeIndex = scanner.nextInt();
        int timeIndex = scanner.nextInt();

        if (nameIndex < names.length && placeIndex < places.length && timeIndex < times.length &&
                nameIndex >= 0 && placeIndex >= 0 && timeIndex >= 0) {
            System.out.println(names[nameIndex] + " йтиме в " + places[placeIndex] + " о " + times[timeIndex] + ":00");
        } else {
            System.out.println("Помилка: один або кілька індексів виходять за межі масивів.");
        }
    }
}

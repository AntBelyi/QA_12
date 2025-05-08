package hw4;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("[\\s,;]+");
        System.out.println("Введите три числа через запятую :");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        String[] name = new String[]{"Петя", "Маша", "Олена", "Федя", "Антон", "Саша", "Гліб"};
        String[] place = new String[]{"школу", "церкву", "магазину", "тренажерного залу", "кіно", "поліклиніку"};
        int[] time = new int[]{10, 12, 14, 16, 18, 20};
        if (name.length <= num1 || place.length <= num2 || time.length <= num3) {
            System.out.println("Число большое оно не подходит");
        } else {
            System.out.println(name[num1] + " буде йти до" + place[num2] + " o " + time[num3] + ":00");
        }
        scanner.close();
    }
}

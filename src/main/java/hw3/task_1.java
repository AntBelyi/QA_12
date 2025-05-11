package hw3;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Я тестую чудово. Що ще потрібно?");

        System.out.println("Введіть,будь ласка,речення:");
        String string1 = scanner.next();
        String string2 = scanner.next();
        String string3 = scanner.next();
        String string4 = scanner.next() + " " + scanner.next() + " " + scanner.next();

        System.out.println(string1);
        System.out.println(string2);
        System.out.println(string3);
        System.out.println(string4);
        scanner.close();
    }
}
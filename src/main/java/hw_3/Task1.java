package hw_3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Я тестую чудово. Що ще потрібно?");

        System.out.println("Enter string please :");
        String string1 = scanner.next();
        String string2 = scanner.next();
        String string3 = scanner.next();
        String string4 = scanner.next() + " " + scanner.next() + " " + scanner.next();

        System.out.println(string1 + " " + string2 + " " + string3 + " " + string4);
        scanner.close();
    }

}

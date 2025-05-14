package hw4;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sentence = new StringBuilder();

        System.out.println("Вводьте слова. Щоб завершити, введіть 'STOP':");

        while (true) {
            String word = scanner.next();
            if (word.equalsIgnoreCase("STOP")) {
                break;
            }
            sentence.append(word).append(" ");
        }

        System.out.println("Підсумкове речення:");
        System.out.println(sentence.toString().trim());
    }
}

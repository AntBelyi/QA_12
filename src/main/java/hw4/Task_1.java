package hw4;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // firstAddWords(scanner);
        secondAddWords(scanner);

    }

    public static void firstAddWords(Scanner scanner) {
        int i = 1;
        String result = " ";
        while (i < 100) {
            System.out.println("Enter new word ");
            String word = scanner.nextLine();
            result = result + word + " ";
            if (word.equals("STOP")) {
                break;
            }
        }
        System.out.println(result);
    }

    public static void secondAddWords(Scanner scanner) {
        int i = 1;
        StringBuilder result = new StringBuilder();

        while (i < 100) {
            System.out.println("Enter new word ");
            String word = scanner.nextLine();

            if (word.equals("STOP")) {
                break;
            }
            result.append(" ").append(word);
        }

        System.out.println(result);
        scanner.close();
    }

}


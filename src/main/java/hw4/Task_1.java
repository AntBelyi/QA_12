package hw4;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        firstAddWords(scanner);
        scanner.close();

    }

    public static void firstAddWords(Scanner scanner) {
        int i = 1;
        String result = " ";
        while (true) {
            System.out.println("Enter new word ");
            String word = scanner.nextLine();
            result = result + word + " ";
            if (word.equals("STOP")) {
                break;
            }
        }
        System.out.println(result);
    }

}




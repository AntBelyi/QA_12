package hw_4;

import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder sentence = new StringBuilder();
        String word;

        System.out.println("Введіть слова (введіть STOP, щоб завершити):");

            while (true) {
                word = scanner.next();
                if (word.equals("STOP")) {
                    break;
                }
                sentence.append(word).append(" ");
            }
            System.out.println("Сформована пропозиція:");
            System.out.println(sentence.toString().trim());
            scanner.close();
    }
}
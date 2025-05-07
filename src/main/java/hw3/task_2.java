package hw3;

import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть першу сторону: ");
        int a = scanner.nextInt();
        System.out.print("Введіть другу сторону: ");
        int b = scanner.nextInt();
        System.out.print("Введіть третю сторону: ");
        int c = scanner.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Можна побудувати трикутник.");
        } else {
            System.out.println("Не можна побудувати трикутник.");
        }
    }
}

package hw_3;
import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        rightAnswer(scanner);

        scanner.close();
    }

    public static void rightAnswer(Scanner scanner) {
        System.out.println("Enter number :");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("You get a triangle");
        } else {
            System.out.println("Not a triangle ");
        }
    }
}

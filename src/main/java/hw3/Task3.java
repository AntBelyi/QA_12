import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть перше число: ");
        int a = scanner.nextInt();

        System.out.print("Введіть друге число: ");
        int b = scanner.nextInt();

        // Використання тернарного оператора
        int difference = (a > b) ? (a - b) : (b - a);

        System.out.println("Різниця: " + difference);
    }
}

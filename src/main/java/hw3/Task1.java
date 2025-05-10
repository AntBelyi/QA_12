import java.util.Scanner;
import java.util.Formatter;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть рядок: Я тестую чудово. Що ще потрібно?");
        System.out.print("> "); // Підказка для користувача

        String string1 = scanner.next(); // Я
        String string2 = scanner.next(); // тестую
        String string3 = scanner.next(); // чудово.
        String string4 = scanner.next() + " " + scanner.next() + " " + scanner.next(); // Що ще потрібно?

        // Приберемо крапку з string3 (опціонально)
        if (string3.endsWith(".")) {
            string3 = string3.substring(0, string3.length() - 1);
        }

        Formatter formatter = new Formatter();
        formatter.format("string1 = %s\nstring2 = %s\nstring3 = %s\nstring4 = %s", string1, string2, string3, string4);
        System.out.println(formatter);
        formatter.close();
    }
}

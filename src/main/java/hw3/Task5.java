import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Введення двох чисел
        System.out.print("Введіть перше число: ");
        int a = scanner.nextInt();

        System.out.print("Введіть друге число: ");
        int b = scanner.nextInt();

        // Введення оператора
        System.out.print("Введіть оператор (+, %, /, *): ");
        char op = scanner.next().charAt(0);

        // Обчислення результату за допомогою тернарного оператора
        int result = (op == '+') ? (a + b) :
                (op == '%') ? (a % b) :
                        (op == '/') ? (b != 0 ? (a / b) : 0) : // перевірка на ділення на 0
                                (op == '*') ? (a * b) : 0;

        System.out.println("Результат: " + result);
    }
}

package hw4;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers :");
        int numbers = scanner.nextInt();

        String string = Integer.toString(numbers);
        StringBuilder stringBuilder = new StringBuilder(string);
        String result = stringBuilder.reverse().toString();
        if (string.equals(result)) {
            System.out.println(" This is polyndome ");
        } else {
            System.out.println(" This isn't polyndome ");
        }
        scanner.close();
    }
}

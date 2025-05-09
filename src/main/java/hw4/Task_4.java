package hw4;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useDelimiter("[\\s,;]+");
        System.out.println("Enter 3 numbers separated by commas:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        String[] name = new String[]{"Peter", "Mary", "Helens", "Fodor", "Anton", "Alex", "Gleb"};
        String[] place = new String[]{"school", "church", "shop", "gym", "cinema", "hospital"};
        int[] time = new int[]{10, 12, 14, 16, 18, 20};
        if (name.length <= num1 || place.length <= num2 || time.length <= num3) {
            System.out.println("The number is too big, it doesn't fit");
        } else {
            System.out.println(name[num1] + " well go to" + place[num2] + " o " + time[num3] + ":00");
        }
        scanner.close();
    }
}

package hw_5;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name :");
        NumbersApplication gamer = new NumbersApplication(scanner.nextLine());
        System.out.println(gamer);
        gamer.startGame(scanner);
        scanner.close();
    }
}

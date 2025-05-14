package hw_5;

import java.util.Random;
import java.util.Scanner;

public class NumbersApplication {
    private String name;
    Random random = new Random();
    private int gameNumber = random.nextInt(100) + 1;

    public NumbersApplication(String name) {
        this.name = name;
    }

    public void startGame(Scanner scanner) {
        System.out.println(" Let's the game  begin!!");
        while (true) {
            System.out.println("Enter number from 0 to 100");
            int number = scanner.nextInt();
            System.out.println("Enter number " + number);
            if (number < gameNumber) {
                System.out.println("Number is too small. Please, try again ");
                continue;
            }
            if (number > gameNumber) {
                System.out.println("Number is too big. Please, try again ");
                continue;
            }
            System.out.println("Congratulations," + name);
            break;
        }
    }

    @Override
    public String toString() {
        return "NumbersApplication{" +
                "name='" + name + '\'' +
                ", gameNumber=" + gameNumber +
                '}';
    }
}

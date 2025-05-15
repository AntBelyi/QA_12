package hw_5;

import java.util.Random;
import java.util.Scanner;

public class NumbersApplication {
    String name;
    int gameNumber;

    public NumbersApplication(String name) {
        this.name = name;
        Random random = new Random();
        this.gameNumber = random.nextInt(101);
    }

        public void startGame(Scanner scanner) {
            System.out.println("Let the game begin!");

            while (true) {
                System.out.print("Enter a number from 0 to 100: ");
                int guess = scanner.nextInt();

                if (guess < gameNumber) {
                    System.out.println("Your number is too small. Please, try again..");
                } else if (guess > gameNumber) {
                    System.out.println("Your number is too big. Please, try again..");
                } else {
                    System.out.println("Congratulations, " + name + "!");
                    break;
                }
            }
        }
    }
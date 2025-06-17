package hw8_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Person> people = new HashMap<>();

        System.out.println("List of people.");
        while (true) {
            System.out.print("Enter the command (addPerson, getPerson, exit): ");
            String command = scanner.nextLine().trim();

            switch (command) {
                case "addPerson":
                    System.out.print("Enter surname:");
                    String surname = scanner.nextLine().trim();
                    String key = surname.toUpperCase();

                    if (people.containsKey(key)) {
                        System.out.println("Person with that surname already exists.");
                        System.out.print("Do you want to replace? (yes/no): ");
                        String confirm = scanner.nextLine().trim().toLowerCase();

                        if (!confirm.equals("yes")) {
                            System.out.println("Not updated.");
                            break;
                        }
                    }

                    System.out.print("Enter name:");
                    String name = scanner.nextLine().trim();

                    System.out.print("Enter age:");
                    int age = Integer.parseInt(scanner.nextLine().trim());

                    Person person = new Person(name, surname, age);
                    people.put(key, person);
                    System.out.println("Person added or updated.");
                    break;

                case "getPerson":
                    if (people.isEmpty()) {
                        System.out.println("The list of people is empty.");
                        break;
                    }

                    System.out.print("Enter surname to search: ");
                    String searchSurname = scanner.nextLine().trim();
                    String searchKey = searchSurname.toUpperCase();

                    if (people.containsKey(searchKey)) {
                        System.out.println(people.get(searchKey));
                    } else {
                        System.out.println("Person with that surname was not found.");
                        System.out.println("Available surnames:");
                        for (String k : people.keySet()) {
                            System.out.println("- " + k);
                        }
                    }
                    break;

                case "exit":
                    System.out.println("Work completed.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Unknown command.Try again.");
                    break;
            }
        }
    }
}
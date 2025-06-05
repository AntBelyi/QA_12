import java.util.*;

public class PersonManager {
    private static Map<String, Person> peopleMap = new HashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Person Manager. Type a command: addPerson, getPerson, or exit.");

        while (true) {
            System.out.print("\nCommand: ");
            String command = scanner.nextLine().trim().toLowerCase();

            switch (command) {
                case "addperson":
                    addPerson();
                    break;
                case "getperson":
                    getPerson();
                    break;
                case "exit":
                    System.out.println("Program terminated.");
                    return;
                default:
                    System.out.println("Unknown command. Please try again.");
            }
        }
    }

    private static void addPerson() {
        System.out.print("Enter surname: ");
        String surnameInput = scanner.nextLine().trim();
        String surnameKey = surnameInput.toUpperCase();

        System.out.print("Enter name: ");
        String name = scanner.nextLine().trim();

        int age;
        while (true) {
            System.out.print("Enter age: ");
            try {
                age = Integer.parseInt(scanner.nextLine().trim());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Error: Age must be a number. Please try again.");
            }
        }

        if (peopleMap.containsKey(surnameKey)) {
            System.out.print("A person with this surname already exists. Replace? (yes/no): ");
            String answer = scanner.nextLine().trim().toLowerCase();
            if (!answer.equals("yes")) {
                System.out.println("Information was not updated.");
                return;
            }
        }

        peopleMap.put(surnameKey, new Person(name, surnameInput, age));
        System.out.println("Person added or updated.");
    }

    private static void getPerson() {
        if (peopleMap.isEmpty()) {
            System.out.println("The person list is empty.");
            return;
        }

        System.out.print("Enter surname to search: ");
        String surnameInput = scanner.nextLine().trim().toUpperCase();

        if (peopleMap.containsKey(surnameInput)) {
            System.out.println("Found: " + peopleMap.get(surnameInput));
        } else {
            System.out.println("No person found with that surname.");
            System.out.println("Available surnames: " + peopleMap.keySet());
        }
    }
}

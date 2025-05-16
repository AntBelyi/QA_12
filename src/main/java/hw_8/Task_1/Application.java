package hw_8.Task_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Person> personMap = new HashMap<>();
        Person onePerson = new Person(25, "Oleg", "Vahnenko");
        Person twoPerson = new Person(35, "Nana", "Petroff");
        personMap.put("AAAA", onePerson);
        personMap.put("MMM", twoPerson);
        System.out.println("Enter command");
        String addInformation = scanner.nextLine();
        System.out.println("Enter key");
        while (true) {
            String keySurname = scanner.nextLine().toUpperCase();
            if ("addPerson".equals(addInformation)) {
                addPerson(personMap, scanner, keySurname);
            } else if ("getPerson".equals(addInformation)) {
                getPerson(personMap, keySurname);

            } else if ("Exit".equals(addInformation)) {
                System.out.println("Program close");
            } else
                System.out.println("Wrong command");
            break;
        }
        System.out.println(personMap);
        scanner.close();
    }

    public static void addPerson(Map<String, Person> personMap, Scanner scanner, String keySurname) {

        if (personMap.containsKey(keySurname)) {
            System.out.println("A person with such parameters exists. Replace them? Yes/No");
            String question = scanner.nextLine();
            switch (question) {
                case ("Yes"):
                    System.out.println("Enter person");
                    int age = scanner.nextInt();
                    String name = scanner.nextLine();
                    String surname = scanner.nextLine();
                    Person person = new Person(age, name, surname);
                    personMap.put(keySurname, person);
                    break;
                case ("No"):
                    break;
                default:
            }

        } else {
            System.out.println("Enter person");
            int age = scanner.nextInt();
            String name = scanner.nextLine();
            String surname = scanner.nextLine();
            Person person = new Person(age, name, surname);
            personMap.put(keySurname, person);
        }
    }

    public static void getPerson(Map<String, Person> personMap, String keySurname) {
        if (personMap.containsKey(keySurname)) {
            Person person = personMap.get(keySurname);
            System.out.println(person);
        } else if (personMap.isEmpty()) {
            System.out.println("No items in personMap");
        }
        System.out.println("This person doesn't exist");
    }

}

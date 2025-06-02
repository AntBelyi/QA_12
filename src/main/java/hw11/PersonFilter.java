import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonFilter {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John", "Doe", 65, 5000));
        persons.add(new Person("Alice", "Smith", 45, 6000));
        persons.add(new Person("Bob", "Brown", 68, 5500));
        persons.add(new Person("Elder", "Jones", 75, 4000));
        persons.add(new Person("Grandma", "Wilson", 80, 3000));

        System.out.println("Full list of people:");
        persons.forEach(System.out::println);

        // Filter: age < 70, store only names
        List<String> filteredNames = persons.stream()
                .filter(p -> p.getAge() < 70)
                .map(Person::getName)
                .collect(Collectors.toList());

        System.out.println("\nNames of people younger than 70:");
        filteredNames.forEach(System.out::println);
    }
}

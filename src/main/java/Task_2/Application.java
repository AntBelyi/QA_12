package hw8_2;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        Person olena = new Person("Olena", "Shevchenko", 32);
        Person oleksandr = new Person("Oleksandr", "Kovalchuk", 45);
        Person andrii = new Person("Andrii", "Melnyk", 38);
        Person yulia = new Person("Yulia", "Tkachenko", 55);
        Person olena2 = new Person("Olena", "Shevchenko", 32);
        Person yulia2 = new Person("Yulia", "Tkachenko", 55);

        Set<Person> people = new LinkedHashSet<>();
        people.add(olena);
        people.add(oleksandr);
        people.add(andrii);
        people.add(yulia);
        people.add(olena2);
        people.add(yulia2);

        System.out.println("List of people in Set (no duplication):");
        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println(people.size());
        System.out.println(people.containsAll(people));
        System.out.println(people.remove(yulia));
        System.out.println(people);
        System.out.println(olena);
    }
}

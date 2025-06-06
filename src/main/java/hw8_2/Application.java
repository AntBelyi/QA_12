package hw8_2;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        Person maria = new Person("Maria", "Ivanova", 29);
        Person bogdan = new Person("Bogdan", "Petrenko", 47);
        Person dmytro = new Person("Dmytro", "Franko", 35);
        Person adam = new Person("Adam", "Otaman", 62);
        Person maria1 = new Person("Maria","Ivanova",29);
        Person adam2 = new Person("Adam","Otaman",62);

        Set<Person> people = new LinkedHashSet<>();
        people.add(maria);
        people.add(bogdan);
        people.add(dmytro);
        people.add(adam);
        people.add(maria1);
        people.add(adam2);

        System.out.println("List of people in Set(no duplication):");
        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println(people.size());
        System.out.println(people.containsAll(people));
        System.out.println(people.remove(adam));
        System.out.println(people);
        System.out.println(maria);
    }
}
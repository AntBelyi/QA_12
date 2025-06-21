package hw_11.Tack_2;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Person olena = new Person("Shevchenko", 1200, "Olena", 68);
        Person petro = new Person("Kovalenko", 1200, "Petro", 75);
        Person maryna = new Person("Tkachenko", 1200, "Maryna", 65);
        Person oleksii = new Person("Bondar", 1200, "Oleksii", 45);
        Person sofia = new Person("Kravets", 1200, "Sofia", 25);

        List<Person> people = List.of(olena, petro, maryna, oleksii, sofia);

        List<Person> youngPerson = people.stream().filter(x -> x.getAge() < 70).toList();
        System.out.println(youngPerson);

        List<String> oldPerson = people.stream().filter(x -> x.getAge() > 70).map(Person::getName).toList();
        System.out.println(oldPerson);
    }
}

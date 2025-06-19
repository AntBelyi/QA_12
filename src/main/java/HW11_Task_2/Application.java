package HW11_Task_2;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        Person fedor = new Person("Fedor", "Ivanov", 65, 3000);
        Person petro = new Person("Petro", "Petrenko", 45, 8000);
        Person oksana = new Person("Oksana", "Shevchenko", 30, 9000);
        Person mykola = new Person("Mykola", "Hrytsenko", 75, 4000);
        Person nina  = new Person("Nina", "Tkachuk", 80, 4500);

        List<Person> persons = List.of(fedor,petro,oksana,mykola,nina);

        List<String> namesUnder70 = persons.stream()
                .filter(person -> person.getAge() < 70)
                .map(Person::getName)
                .toList();

        System.out.println(persons);
        System.out.println(namesUnder70);
    }
}

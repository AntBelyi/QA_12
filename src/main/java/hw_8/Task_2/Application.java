package hw_8.Task_2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        Set<Person> people = new LinkedHashSet<>();

        Person olga = new Person(17, "Olga", "Kovaleva");
        Person vika = new Person(28, "Vika", "Belous");
        Person oleg = new Person(35, "Oleg", "Trofimenko");
        Person ivan = new Person(34, "Ivan", "Ivanko");
        Person vika2 = new Person(28, "Vika", "Belous");
        Person ivan3 = new Person(34, "Ivan", "Ivanko");

        people.add(olga);
        people.add(ivan);
        people.add(oleg);
        people.add(vika);
        people.add(vika2);
        people.add(ivan3);
        System.out.println(people);

        for (Person person : people) {
            if (person.getName().equals("Olga")) {
                System.out.println("woman.");
            } else if (person.getName().equals("Vika")) {
                System.out.println("woman.");
            } else {
                System.out.println("man");
            }
        }
        System.out.println(people.size());

        System.out.println(people.contains(ivan));
        for (Person person : people) {
            if (person.getName().equals("Ivan")) {
                people.remove(person);
                person.setName("Kolya");
                people.add(person);
                break;
            }
        }
        System.out.println("Ivan changed his name to Kolya " + people);
        people.clear();
        System.out.println("clear people"+people);
    }


}

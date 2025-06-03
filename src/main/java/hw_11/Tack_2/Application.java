package hw_11.Tack_2;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Person vlad = new Person("Vovan", 1200, "Vlad", 72);
        Person ivan = new Person("Ivanov", 1200, "Ivan", 71);
        Person denis = new Person("Povarov", 1200, "Denis", 60);
        Person nik = new Person("Nikolaev", 1200, "Nik", 40);
        Person alla = new Person("Borisova", 1200, "Alla", 20);

        List<Person> people = List.of(vlad, ivan, denis, nik, alla);

        List<Person> youngPerson = people.stream().filter(x -> x.getAge() < 70).toList();
        System.out.println(youngPerson);
        List<String> oldPerson = people.stream().filter(x -> x.getAge() > 70).map(x -> x.getName()).toList();
        System.out.println(oldPerson);

    }


}

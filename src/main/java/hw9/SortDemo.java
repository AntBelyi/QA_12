import java.util.*;

public class SortDemo {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Vehicle("BMW", 240, 35000));
        vehicles.add(new Vehicle("Audi", 230, 33000));
        vehicles.add(new Vehicle("Tesla", 250, 50000));
        vehicles.add(new Vehicle("Honda", 200, 22000));
        vehicles.add(new Vehicle("Toyota", 210, 25000));

        System.out.println("Unsorted list:");
        vehicles.forEach(System.out::println);

        vehicles.sort(null); // або Collections.sort(vehicles)

        System.out.println("\nSorted by speed:");
        vehicles.forEach(System.out::println);
    }
}

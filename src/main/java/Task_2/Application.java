package Task_2;

import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        Vehicle car1 = new Vehicle("Ferrari", 300, 55000, 4);
        Vehicle car2 = null;

        Optional<Vehicle> vehicle1 = Optional.ofNullable(car1);
        Optional<Vehicle> vehicle2 = Optional.ofNullable(car2);

        System.out.println(vehicle1);
        System.out.println(vehicle2);

        System.out.println(vehicle1);
        System.out.println("isPresent(): " + vehicle1.isPresent());
        System.out.println("isEmpty(): " + vehicle1.isEmpty());

        vehicle1.ifPresent(v -> System.out.println("ifPresent(): " + v));

        Vehicle defaultVehicle = new Vehicle("Bicycle", 50, 1000, 2);
        System.out.println("orElse(): " + vehicle1.orElse(defaultVehicle));

        System.out.println("orElseGet(): " + vehicle1.orElseGet(() ->
                new Vehicle("Logan", 220, 20000, 4)));

        try {
            Vehicle v = vehicle1.orElseThrow(() -> new RuntimeException("Object missing"));
            System.out.println("orElseThrow(): " + v);
        } catch (RuntimeException e) {
            System.out.println("orElseThrow(): " + e.getMessage());
        }

        Optional<String> name1 = vehicle1.map(Vehicle::getName);
        System.out.println("map(): " + name1.orElse("Name missing"));

        System.out.println(vehicle2);
        System.out.println("isPresent(): " + vehicle2.isPresent());
        System.out.println("isEmpty(): " + vehicle2.isEmpty());

        vehicle2.ifPresent(v -> System.out.println("ifPresent(): " + v));

        System.out.println("orElse(): " + vehicle2.orElse(defaultVehicle));

        System.out.println("orElseGet(): " + vehicle2.orElseGet(() ->
                new Vehicle("Logan", 220, 20000, 4)));

        try {
            Vehicle v = vehicle2.orElseThrow(() -> new RuntimeException("Object missing"));
            System.out.println("orElseThrow(): " + v);
        } catch (RuntimeException e) {
            System.out.println("orElseThrow(): " + e.getMessage());
        }

        Optional<String> name2 = vehicle2.map(Vehicle::getName);
        System.out.println("map(): " + name2.orElse("Name missing"));
    }
}
import java.util.Optional;

public class MainOptionalVehicle {

    public static void main(String[] args) {
        // 1. Create one instance using the constructor
        Vehicle car = new Vehicle("Tesla Model 3", 225.0, 45000.0, 4);
        Optional<Vehicle> optionalCar = Optional.of(car); // Optional.of() does not allow null

        // 2. Assign null to another instance (or an empty Optional)
        Vehicle bike = null;
        Optional<Vehicle> optionalBike = Optional.ofNullable(bike); // Optional.ofNullable() allows null

        System.out.println("--- Testing Optional for optionalCar (non-null) ---");
        // isPresent()
        System.out.println("optionalCar.isPresent(): " + optionalCar.isPresent()); // true

        // isEmpty() (from Java 11+)
        // System.out.println("optionalCar.isEmpty(): " + optionalCar.isEmpty()); // false

        // get() - retrieves the value (throws NoSuchElementException if empty)
        System.out.println("optionalCar.get(): " + optionalCar.get()); // Vehicle{...}

        // ifPresent() - performs an action if a value is present
        optionalCar.ifPresent(v -> System.out.println("ifPresent for optionalCar: " + v.getName()));

        // orElse() - returns the value if present, otherwise returns a provided default value
        Vehicle defaultCar = new Vehicle("Default Car", 100.0, 10000.0, 4);
        Vehicle resolvedCar = optionalCar.orElse(defaultCar);
        System.out.println("optionalCar.orElse(defaultCar): " + resolvedCar);

        // orElseGet() - returns the value if present, otherwise returns the result of a Supplier
        Vehicle generatedCar = optionalCar.orElseGet(() -> new Vehicle("Generated Car", 120.0, 15000.0, 4));
        System.out.println("optionalCar.orElseGet(() -> ...): " + generatedCar);

        // map() - applies a function to the value if present, returning an Optional with the result
        Optional<String> carName = optionalCar.map(Vehicle::getName);
        System.out.println("optionalCar.map(Vehicle::getName): " + carName.orElse("No name"));

        Optional<Double> carSpeedDoubled = optionalCar.map(v -> v.getSpeed() * 2);
        System.out.println("optionalCar.map(v -> v.getSpeed() * 2): " + carSpeedDoubled.orElse(0.0));

        // filter() - returns an Optional with the value if it matches a predicate, otherwise Optional.empty()
        Optional<Vehicle> fastCar = optionalCar.filter(v -> v.getSpeed() > 200);
        System.out.println("optionalCar.filter(v -> v.getSpeed() > 200): " + fastCar.orElse(new Vehicle("Slow Car", 0, 0, 0)));


        System.out.println("\n--- Testing Optional for optionalBike (null) ---");
        // isPresent()
        System.out.println("optionalBike.isPresent(): " + optionalBike.isPresent()); // false

        // isEmpty() (from Java 11+)
        // System.out.println("optionalBike.isEmpty(): " + optionalBike.isEmpty()); // true

        // get() - calling this method will throw NoSuchElementException!
        try {
            System.out.println("optionalBike.get(): " + optionalBike.get());
        } catch (java.util.NoSuchElementException e) {
            System.out.println("optionalBike.get() threw: " + e.getMessage()); // No value present
        }

        // ifPresent() - nothing will happen as the value is absent
        optionalBike.ifPresent(v -> System.out.println("ifPresent for optionalBike: " + v.getName()));
        System.out.println("ifPresent for optionalBike did not execute because the value is absent.");


        // orElse() - will return the default value
        Vehicle resolvedBike = optionalBike.orElse(defaultCar); // Reusing defaultCar
        System.out.println("optionalBike.orElse(defaultCar): " + resolvedBike); // defaultCar

        // orElseGet() - will return the result of the Supplier
        Vehicle generatedBike = optionalBike.orElseGet(() -> new Vehicle("Generated Bike", 80.0, 2000.0, 2));
        System.out.println("optionalBike.orElseGet(() -> ...): " + generatedBike); // Generated Bike

        // map() - will return an empty Optional
        Optional<String> bikeName = optionalBike.map(Vehicle::getName);
        System.out.println("optionalBike.map(Vehicle::getName): " + bikeName.orElse("No name for bike")); // No name for bike

        Optional<Double> bikeSpeedDoubled = optionalBike.map(v -> v.getSpeed() * 2);
        System.out.println("optionalBike.map(v -> v.getSpeed() * 2): " + bikeSpeedDoubled.orElse(0.0));

        // filter() - will return an empty Optional
        Optional<Vehicle> fastBike = optionalBike.filter(v -> v.getSpeed() > 200);
        System.out.println("optionalBike.filter(v -> v.getSpeed() > 200): " + fastBike.orElse(new Vehicle("Slow Bike", 0, 0, 0)));
    }
}
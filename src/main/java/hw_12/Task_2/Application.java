package hw_12.Task_2;

import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        Vechicle car = new Vechicle("Car", 15000, 300, 4);
        Vechicle plane = null;
        Optional<Vechicle> result = Optional.ofNullable(car);
        Optional<Vechicle> resultNull = Optional.ofNullable(plane);
        if (result.isPresent()) {
            String name = result.get().getName();
            System.out.println(name);
        }
        Vechicle result1 = result.orElseGet(() -> (new Vechicle("Boat", 100, 20, 0)));
        System.out.println(result1 + "if vechicle exists, a new one is not created");

        Vechicle result2 = resultNull.orElseGet(() -> (new Vechicle("Boat", 100, 20, 0)));
        System.out.println(result2 + "If vechicle null, create new vechilce boat");

        Vechicle result3 = result.orElse(car);
        Vechicle result4 = resultNull.orElse(plane);
        System.out.println(result3 + "vechicle exists");
        System.out.println(result4 + "vechicle null");

        Vechicle result5 = Optional.ofNullable(plane).orElse(car);
        Vechicle result6 = Optional.ofNullable(plane).orElseGet(() -> (new Vechicle("train", 20, 80, 0)));
        System.out.println(result5);
        System.out.println(result6);


    }
}

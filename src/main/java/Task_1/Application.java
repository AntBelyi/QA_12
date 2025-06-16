package hw_9.Task_1;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Car_1 tesla     = new Car_1("Tesla Model S", 79_999, 322);
        Car_1 bmw       = new Car_1("BMW M3",        69_999, 290);
        Car_1 audi      = new Car_1("Audi RS7",     114_000, 305);
        Car_1 mercedes  = new Car_1("Mercedes‑AMG GT",118_600,310);
        Car_1 toyota    = new Car_1("Toyota Supra",  43_000, 250);

        CarSpeedComparator carSpeedComparator = new CarSpeedComparator();

        List<Car_1> cars = new ArrayList<>();
        cars.add(tesla);
        cars.add(bmw);
        cars.add(audi);
        cars.add(mercedes);
        cars.add(toyota);

        cars.sort(carSpeedComparator);

        // Now the list is sorted from slowest to fastest.
        // Print each car so you can see the result.
        for (Car_1 car : cars) {
            System.out.println(car);
        }
    }
}

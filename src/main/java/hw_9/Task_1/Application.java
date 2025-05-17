package hw_9.Task_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Cars lada = new Cars("Lada", 2500, 135);
        Cars ferrari = new Cars("ferrari", 250000, 450);
        Cars renault = new Cars("renault", 5500, 190);
        Cars bmw = new Cars("bmw", 7500, 250);
        Cars toyota = new Cars("toyota", 2500, 240);
        Cars man = new Cars("Man", 42000, 110);

        CarsComparator carsComparator = new CarsComparator();

        List<Cars> carsList = new ArrayList<>();
        carsList.add(lada);
        carsList.add(ferrari);
        carsList.add(renault);
        carsList.add(bmw);
        carsList.add(toyota);
        carsList.add(man);
        carsList.sort(carsComparator);
        System.out.println(carsList);

    }
}

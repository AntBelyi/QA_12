package hw9_1;

import java.awt.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.concurrent.Callable;

public class Application {
    public static void main(String[] args) {
        Car Porsche = new Car("Porsche",29000,300);
        Car BWW = new Car("BWB",25000,280);
        Car Kia = new Car("Kia",21000,270);
        Car Opel = new Car("Opel",19000,240);
        Car Honda = new Car("Honda",26000,290);

        TreeSet <Car> cars = new TreeSet<>();

        cars.add(Porsche);
        cars.add(BWW);
        cars.add(Kia);
        cars.add(Opel);
        cars.add(Honda);
            System.out.println(cars);

            CarSpeedComparator carSpeedComparator = new CarSpeedComparator();
            TreeSet <Car> carSet = new TreeSet<>(carSpeedComparator);
            carSet.add(Porsche);
            carSet.add(BWW);
            carSet.add(Kia);
            carSet.add(Opel);
            carSet.add(Honda);
            System.out.println(carSpeedComparator);

            List <Car> carList = new ArrayList<>();
            carList.add(Porsche);
            carList.add(BWW);
            carList.add(Kia);
            carList.add(Opel);
            carList.add(Honda);

            System.out.println(carList);
            carList.sort(carSpeedComparator);
    }
}
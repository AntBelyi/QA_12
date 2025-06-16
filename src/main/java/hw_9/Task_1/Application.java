package hw_9.Task_1;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        Car_1 Porsche = new Car_1("Porsche", 29000, 300);
        Car_1 BWB = new Car_1("BWB", 25000, 280);
        Car_1 Kia = new Car_1("Kia", 21000, 270);
        Car_1 Opel = new Car_1("Opel", 19000, 240);
        Car_1 Honda = new Car_1("Honda", 26000, 290);

        CarSpeedComparator carSpeedComparator = new CarSpeedComparator();

        List <Car_1> car1List= new ArrayList<>();
        car1List.add(Porsche);
        car1List.add(BWB);
        car1List.add(Kia);
        car1List.add(Opel);
        car1List.add(Honda);

        car1List.sort(carSpeedComparator);
        System.out.println(carSpeedComparator);
    }
}
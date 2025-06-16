package hw_9.Task_1;

import java.util.Comparator;

public class CarSpeedComparator implements Comparator<Car_1> {
    @Override
    public int compare(Car_1 o1, Car_1 o2) {
        return o2.getSpeed() - o1.getSpeed();
    }
}
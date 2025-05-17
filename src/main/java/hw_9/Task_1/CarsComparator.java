package hw_9.Task_1;

import java.util.Comparator;

public class CarsComparator implements Comparator<Cars> {

    @Override
    public int compare(Cars o1, Cars o2) {
        return o1.getSpeed() - o2.getSpeed();
    }
}

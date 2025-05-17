package hw_9.Task_1;

import java.util.Comparator;

public class Cars {
    private String name;
    private int price;
    private int speed;

    public Cars(String name, int price, int speed) {
        this.name = name;
        this.price = price;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", speed=" + speed +
                '}';
    }

}

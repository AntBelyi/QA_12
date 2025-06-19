package HW12_Task_2;

public class Vehicle {
    private String name;
    private int speed;
    private double price;
    private int countOfWheels;

    public Vehicle(String name, int speed, double price, int countOfWheels) {
        this.name = name;
        this.speed = speed;
        this.price = price;
        this.countOfWheels = countOfWheels;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public double getPrice() {
        return price;
    }

    public int getCountOfWheels() {
        return countOfWheels;
    }

    @Override
    public String toString() {
        return "Vechicle{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", price=" + price +
                ", countOfWheels=" + countOfWheels +
                '}';
    }
}

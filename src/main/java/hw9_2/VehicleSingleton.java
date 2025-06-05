package hw9_2;

public class VehicleSingleton {
    private static VehicleSingleton instance;

    private String name;
    private int speed;
    private double price;

    private VehicleSingleton(String name, int speed, double price) {
        this.name = name;
        this.speed = speed;
        this.price = price;
    }

    public static VehicleSingleton getInstance(String name, int speed, double price) {
        if (instance == null) {
            instance = new VehicleSingleton(name, speed, price);
        }
        return instance;
    }

    public String toString() {
        return "VehicleSingleton{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }
}
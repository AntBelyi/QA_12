package hw_9.Task_2;

public class VehicleSingleton {
    private static VehicleSingleton instance;
    private String name;
    private int speed;
    private int price;

    private VehicleSingleton(String name, int price, int speed) {
        this.name = name;
        this.price = price;
        this.speed = speed;
    }

    public static VehicleSingleton getInstance(String name, int speed, int price) {
        if (instance == null) {
            instance = new VehicleSingleton(name, price, speed);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "VehicleSingleton{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }
}

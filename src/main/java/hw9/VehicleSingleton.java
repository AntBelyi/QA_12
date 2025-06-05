public class VehicleSingleton {
    private static VehicleSingleton instance;
    private final String name;
    private final int speed;
    private final double price;

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

    @Override
    public String toString() {
        return name + " - Speed: " + speed + ", Price: $" + price;
    }
}

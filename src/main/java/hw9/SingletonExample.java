public class SingletonExample {
    public static void main(String[] args) {
        System.out.println("--- Singleton Example ---");

        Vehicle vehicle1 = Vehicle.getInstance("Car", 200, 10000);
        Vehicle vehicle2 = Vehicle.getInstance("Bike", 150, 5000);
        Vehicle vehicle3 = Vehicle.getInstance("Truck", 100, 25000);

        // All objects will have the same hash code and same data (first one)
        System.out.println(vehicle1);
        System.out.println(vehicle2);
        System.out.println(vehicle3);

        System.out.println("HashCodes:");
        System.out.println(vehicle1.hashCode());
        System.out.println(vehicle2.hashCode());
        System.out.println(vehicle3.hashCode());
    }
}

class Vehicle {
    private static Vehicle instance;
    private String name;
    private int speed;
    private double price;

    // Private constructor to prevent direct instantiation
    private Vehicle(String name, int speed, double price) {
        this.name = name;
        this.speed = speed;
        this.price = price;
    }

    // Static method to get the single instance
    public static Vehicle getInstance(String name, int speed, double price) {
        if (instance == null) {
            instance = new Vehicle(name, speed, price);
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Vehicle{name='" + name + "', speed=" + speed + ", price=" + price + "}";
    }
}

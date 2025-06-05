public class Vehicle implements Comparable<Vehicle> {
    private String name;
    private int speed;
    private double price;

    public Vehicle(String name, int speed, double price) {
        this.name = name;
        this.speed = speed;
        this.price = price;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public int compareTo(Vehicle other) {
        return Integer.compare(this.speed, other.speed);
    }

    @Override
    public String toString() {
        return name + " - Speed: " + speed + " km/h, Price: $" + price;
    }
}

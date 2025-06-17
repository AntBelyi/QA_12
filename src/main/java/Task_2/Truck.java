package Task_2;

public class Truck extends Vehicle {
    private double loadCapacity;

    public Truck(String name, int speed, double loadCapacity) {
        super(name, speed);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public void move() {
        System.out.println("Vehicle" + " " + getName() + " " + "by load capacity" + "t" + getLoadCapacity() + "," + "moving at speed" + " " + getSpeed() + " " + "km/h");
    }
}
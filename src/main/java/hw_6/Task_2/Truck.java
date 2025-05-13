package hw_6.Task_2;

public class Truck extends Vihicle {
    private double loadCapacity;

    public Truck(String name, int speed, double loadCapacity) {
        super(name, speed);
        this.loadCapacity = loadCapacity;
    }

    public double getLoadCapacity() {
        return loadCapacity;
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void move() {
        System.out.println("The " + getName() + " loadCapacity " + loadCapacity + " is moving at speed " + getSpeed());
    }
}

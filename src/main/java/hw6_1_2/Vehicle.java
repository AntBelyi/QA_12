package hw6_1_2;

public class Vehicle {
    private String name;
    private int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void move() {
        System.out.println("Vehicle is moving at speed" + " " + getSpeed()+ " " + "km/h");
    }

    public void stop() {
        System.out.println("Vehicle" + " " + getName() + " " + "stop");
    }
}
// Base class Vehicle
class Vehicle {
    protected String name;
    protected int speed;

    public Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public void move() {
        System.out.println("The vehicle is moving at " + speed + " km/h");
    }

    public void stop() {
        System.out.println("The vehicle " + name + " has stopped");
    }
}

// Subclass Car
class Car extends Vehicle {
    private int passengerCapacity;

    public Car(String name, int speed, int passengerCapacity) {
        super(name, speed);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public void move() {
        System.out.println("The vehicle " + name + " is moving at " + speed + " km/h with " + passengerCapacity + " people");
    }
}

// Subclass Truck
class Truck extends Vehicle {
    private double loadCapacity; // load capacity in tons

    public Truck(String name, int speed, double loadCapacity) {
        super(name, speed);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void move() {
        System.out.println("The vehicle " + name + " with a load capacity of " + loadCapacity + " tons is moving at " + speed + " km/h");
    }
}

// Main class for demonstration
public class VehicleDemo {
    public static void main(String[] args) {
        // Create objects
        Car sedan = new Car("Honda Civic", 120, 5);
        Truck bigTruck = new Truck("Volvo FH", 80, 20.5);

        System.out.println("--- Vehicle Demonstration ---");

        System.out.println("Sedan:");
        sedan.move();
        sedan.stop();
        System.out.println();

        System.out.println("Truck:");
        bigTruck.move();
        bigTruck.stop();
        System.out.println();
    }
}
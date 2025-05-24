class Vehicle {
    String name;
    int speed;

    Vehicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    void move() {
        System.out.println("The vehicle is moving at " + speed + " km/h");
    }

    void stop() {
        System.out.println("The vehicle " + name + " has stopped");
    }
}

class Car extends Vehicle {
    int passengerCapacity;

    Car(String name, int speed, int passengerCapacity) {
        super(name, speed);
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    void move() {
        System.out.println("The vehicle " + name + " is moving at " + speed + " km/h with " + passengerCapacity + " people");
    }
}

class Truck extends Vehicle {
    double loadCapacity;

    Truck(String name, int speed, double loadCapacity) {
        super(name, speed);
        this.loadCapacity = loadCapacity;
    }

    @Override
    void move() {
        System.out.println("The vehicle " + name + " with load capacity " + loadCapacity + " is moving at " + speed + " km/h");
    }
}

public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car("Sedan", 120, 5);
        car.move();
        car.stop();

        Truck truck = new Truck("Truck", 80, 15.5);
        truck.move();
        truck.stop();
    }
}

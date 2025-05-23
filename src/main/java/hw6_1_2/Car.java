package hw6_1_2;

public class Car extends Vehicle {
    private int passengerCapacity;

    public Car(String name, int speed, int passengerCapacity) {
        super(name, speed);
        this.passengerCapacity = passengerCapacity;
    }
    public int getPassengerCapacity(){
        return passengerCapacity;
    }

    @Override
    public void move() {
        System.out.println("Vehicle" + " " + getName() + " " + "moves at the speed" + " " + getSpeed() + " " + "km/h" + "," + getPassengerCapacity() + " " + "people");
    }
}
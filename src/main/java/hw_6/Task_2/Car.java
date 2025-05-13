package hw_6.Task_2;

public class Car extends Vihicle{
    public int passengerCapacity;
    public Car(String name, int speed,int passengerCapacity) {
        super(name, speed);
        this.passengerCapacity = passengerCapacity;
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void move() {
        System.out.println("The "+getName()+" is moving at speed "+getSpeed()+" passenger capacity "+passengerCapacity);
    }
}

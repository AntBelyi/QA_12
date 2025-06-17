package Task_2;

public class Application {
    public static void main(String[] args) {
        Car car = new Car("BMW", 240, 5);
        car.move();
        car.stop();

        Truck truck = new Truck("MAN", 180, 26);
        truck.move();
        truck.stop();
    }
}
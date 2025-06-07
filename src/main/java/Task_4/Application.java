package Task_4;

public class Application {
    public static void main(String[] args) {
        Car car = new Car.Builder()
                .setModel("Lexus Rx")
                .setPrice(81700)
                .setMaxSpeed(350)
                .setCountOfWheels(4)
                .build();

        System.out.println(car);
    }
}
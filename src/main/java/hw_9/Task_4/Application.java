package hw_9.Task_4;

public class Application {
    public static void main(String[] args) {
        Car bmw = new Car.Builder().setName("bmw")
                .setPrica(2400.5).setMaxSpeed(135).setCountOfWheels(5).build();
        System.out.println(bmw);

    }
}

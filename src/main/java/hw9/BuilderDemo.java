public class BuilderDemo {
    public static void main(String[] args) {
        Car myCar = new Car.Builder()
                .setModel("Tesla Model S")
                .setPrice(79999.99)
                .setMaxSpeed(250)
                .setCountOfWheels(4)
                .build();

        System.out.println(myCar);
    }
}

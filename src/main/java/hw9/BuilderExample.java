public class BuilderExample {
    public static void main(String[] args) {
        System.out.println("--- Builder Pattern Example ---");

        // Creating a Car object using the Builder
        Car car = new Car.Builder()
                .setModel("Tesla Model S")
                .setPrice(79999.99)
                .setMaxSpeed(250)
                .setCountOfWheels(4)
                .build();

        System.out.println(car);
    }
}

class Car {
    private String model;
    private double price;
    private int maxSpeed;
    private int countOfWheels;

    // Private constructor
    private Car(Builder builder) {
        this.model = builder.model;
        this.price = builder.price;
        this.maxSpeed = builder.maxSpeed;
        this.countOfWheels = builder.countOfWheels;
    }

    // Static nested Builder class
    public static class Builder {
        private String model;
        private double price;
        private int maxSpeed;
        private int countOfWheels;

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setMaxSpeed(int maxSpeed) {
            this.maxSpeed = maxSpeed;
            return this;
        }

        public Builder setCountOfWheels(int countOfWheels) {
            this.countOfWheels = countOfWheels;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                ", countOfWheels=" + countOfWheels +
                '}';
    }
}

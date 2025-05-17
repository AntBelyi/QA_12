package hw_9.Task_4;

public class Car {
    private String name;
    private double price;
    private int maxSpeed;
    private int countOfWheels;

    private Car(Builder builder) {
        this.name = builder.name;
        this.price = builder.price;
        this.maxSpeed = builder.maxSpeed;
        this.countOfWheels = builder.countOfWheels;
    }

    public static class Builder {
        private String name;
        private double price;
        private int maxSpeed;
        private int countOfWheels;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setPrica(double price) {
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
                "countOfWheels=" + countOfWheels +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}

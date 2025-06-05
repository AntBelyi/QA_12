package hw9_4;

public class Car {
    private String model;
    private double price;
    private int maxSpeed;
    private int countOfWheels;

    private Car(Builder builder) {
        this.model = builder.setModel();
        this.price = builder.setPrice();
        this.maxSpeed = builder.setMaxSpeed();
        this.countOfWheels = builder.setCountOfWheels();
    }

    public String toString() {
        return "Car{" +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                "countOfWheels=" + countOfWheels +
                '}';
    }
}

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
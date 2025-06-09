package hw_12.Task_2;

public class Vechicle {
    private String name;
    private int speed;
    private int price;
    private int countOffWheels;

    public Vechicle( String name, int price, int speed,int countOffWheels) {
        this.countOffWheels = countOffWheels;
        this.name = name;
        this.price = price;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPrice() {
        return price;
    }

    public int getCountOffWheels() {
        return countOffWheels;
    }

    @Override
    public String toString() {
        return "Vechicle{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", price=" + price +
                ", countOffWheels=" + countOffWheels +
                '}';
    }
}

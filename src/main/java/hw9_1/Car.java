package hw9_1;

public class Car implements Comparable <Car>{

    private String name;
    private int price;
    private int speed;

    public Car(String name, int price, int speed) {
        this.name = name;
        this.price = price;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public  int compareTo(Car o){
        return this.speed - o.speed;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", speed=" + speed +
                '}';
    }
}
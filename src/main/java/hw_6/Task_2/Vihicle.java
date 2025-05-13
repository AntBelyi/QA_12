package hw_6.Task_2;

public class Vihicle {
    private String name;
    private int speed;

    public Vihicle(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public void move() {
        System.out.println("The vehicle is moving at speed " + speed);
    }

    public void stop() {
        System.out.println("The vehicle " + name + " has stopped ");
    }
}

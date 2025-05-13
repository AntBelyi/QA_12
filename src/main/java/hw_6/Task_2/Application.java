package hw_6.Task_2;

public class Application {
    public static void main(String[] args) {
        Vihicle vihicle = new Vihicle("Mercedes", 280);
        vihicle.move();
        vihicle.stop();
        Vihicle volvo = new Car("volvo", 250, 5);
        volvo.move();
        volvo.stop();
        Truck lada = new Truck("lada", 130, 3.2);
        lada.move();
        lada.stop();
    }
}

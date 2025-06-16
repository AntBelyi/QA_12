package hw_9.Task_2;

public class Application {
    public static void main(String[] args) {
        VehicleSingleton tesla  = VehicleSingleton.getInstance("Tesla", 320, 85000);
        VehicleSingleton bmw    = VehicleSingleton.getInstance("BMW", 290, 72000);
        VehicleSingleton toyota = VehicleSingleton.getInstance("Toyota", 250, 38000);

        System.out.println(tesla + " | Hash: " + tesla.hashCode());
        System.out.println(bmw + " | Hash: " + bmw.hashCode());
        System.out.println(toyota + " | Hash: " + toyota.hashCode());
    }
}

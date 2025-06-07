package Task_2;

public class Application {
    public static void main(String[] args) {
        VehicleSingleton Subaru = VehicleSingleton.getInstance("Subaru", 280, 27000);
        VehicleSingleton Nissan = VehicleSingleton.getInstance("Nissan", 260, 24000);
        VehicleSingleton Ford = VehicleSingleton.getInstance("Ford", 240, 22000);

        System.out.println(Subaru + " | Hash: " + Subaru.hashCode());
        System.out.println(Nissan + " | Hash: " + Nissan.hashCode());
        System.out.println(Ford + " | Hash: " + Ford.hashCode());
    }
}

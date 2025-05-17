package hw_9.Task_2;


public class Application {
    public static void main(String[] args) {
        VehicleSingleton bwv = VehicleSingleton.getInstance("bmw", 320, 45000);
        VehicleSingleton man = VehicleSingleton.getInstance("man", 150, 250002);

        System.out.println(bwv + "\n" + man);
        System.out.println(bwv.hashCode() + "\n" + man.hashCode());
    }
}

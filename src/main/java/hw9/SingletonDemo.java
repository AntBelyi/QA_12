public class SingletonDemo {
    public static void main(String[] args) {
        VehicleSingleton v1 = VehicleSingleton.getInstance("BMW", 240, 35000);
        VehicleSingleton v2 = VehicleSingleton.getInstance("Audi", 220, 30000);
        VehicleSingleton v3 = VehicleSingleton.getInstance("Tesla", 260, 55000);

        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);

        System.out.println("Hash v1: " + v1.hashCode());
        System.out.println("Hash v2: " + v2.hashCode());
        System.out.println("Hash v3: " + v3.hashCode());
    }
}

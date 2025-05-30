import java.util.*;

class Machine {
    String name;
    int speed;

    public Machine(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return name + " (" + speed + " km/h)";
    }
}

public class SortingExample {
    public static void main(String[] args) {
        // Create 5 machines
        List<Machine> machines = new ArrayList<>();
        machines.add(new Machine("BMW", 240));
        machines.add(new Machine("Toyota", 180));
        machines.add(new Machine("Mercedes", 220));
        machines.add(new Machine("Ford", 200));
        machines.add(new Machine("Audi", 250));

        // Print the list before sorting
        System.out.println("Before sorting:");
        for (Machine machine : machines) {
            System.out.println(machine);
        }

        // Sort machines by speed (ascending)
        machines.sort(Comparator.comparingInt(m -> m.speed));

        // Print the list after sorting
        System.out.println("\nAfter sorting by speed:");
        for (Machine machine : machines) {
            System.out.println(machine);
        }
    }
}

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        String[] names = {"Petya", "Masha", "Olena", "Fedya", "Sasha", "Anton", "Hlib"};
        int[] times = {10, 12, 14, 16, 18, 20};
        String[] places = {"school", "store", "church", "gym", "cinema", "clinic"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter indexes for name, place, and time (space-separated):");
        int nameIndex = scanner.nextInt();
        int placeIndex = scanner.nextInt();
        int timeIndex = scanner.nextInt();

        if (nameIndex < names.length && placeIndex < places.length && timeIndex < times.length &&
                nameIndex >= 0 && placeIndex >= 0 && timeIndex >= 0) {
            System.out.println(names[nameIndex] + " will go to the " + places[placeIndex] + " at " + times[timeIndex] + ":00");
        } else {
            System.out.println("Error: one or more indexes are out of bounds.");
        }
    }
}

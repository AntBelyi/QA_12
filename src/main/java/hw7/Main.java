package hw7;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Create a warehouse for storing Strings
        Warehouse<String> stringWarehouse = new Warehouse<>();

        System.out.println(">>> Adding items to the warehouse:");
        stringWarehouse.addItem("Box");
        stringWarehouse.addItem("Chair");
        stringWarehouse.addItem("Table");

        System.out.println("Number of items: " + stringWarehouse.getItemCount());
        System.out.println("Viewing items: " + stringWarehouse.viewItems());

        System.out.println(">>> Is the warehouse empty? " + stringWarehouse.isEmpty());

        System.out.println(">>> Retrieving all items from the warehouse...");
        List<String> retrieved = stringWarehouse.retrieveAll();
        System.out.println("Retrieved items: " + retrieved);

        System.out.println(">>> After clearing:");
        System.out.println("Number of items: " + stringWarehouse.getItemCount());
        System.out.println("Is warehouse empty? " + stringWarehouse.isEmpty());

        System.out.println(">>> Adding items again...");
        stringWarehouse.addItem("Lamp");
        stringWarehouse.addItem("Sofa");
        System.out.println("Current items: " + stringWarehouse.viewItems());

        System.out.println(">>> Manually clearing the warehouse...");
        stringWarehouse.clear();
        System.out.println("Is warehouse empty? " + stringWarehouse.isEmpty());
    }
}

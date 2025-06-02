import java.util.List;

public class WarehouseTest {
    public static void main(String[] args) {
        // Create a warehouse for storing strings (e.g., item names)
        Warehouse<String> warehouse = new Warehouse<>();

        // Add items
        warehouse.addItem("Screwdriver");
        warehouse.addItem("Hammer");
        warehouse.addItem("Nails");

        // Check the number of items
        System.out.println("Number of items in the warehouse: " + warehouse.getItemCount());

        // View all items without removing them
        List<String> items = warehouse.viewItems();
        System.out.println("Items in the warehouse: " + items);

        // Check if the warehouse is empty
        System.out.println("Is the warehouse empty? " + warehouse.isEmpty());

        // Retrieve and remove all items
        List<String> retrievedItems = warehouse.retrieveAll();
        System.out.println("Retrieved items from the warehouse: " + retrievedItems);

        // Check again if the warehouse is empty
        System.out.println("Is the warehouse empty after retrieval? " + warehouse.isEmpty());

        // Add more items and clear the warehouse
        warehouse.addItem("Wrench");
        warehouse.addItem("Drill");
        System.out.println("Number of items before clearing: " + warehouse.getItemCount());
        warehouse.clear();
        System.out.println("Number of items after clearing: " + warehouse.getItemCount());
    }
}

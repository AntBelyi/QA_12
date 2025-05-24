package hw7_1;

public class Application {
    public static void main(String[] args) {
        Warehouse<String> stringWarehouse = new Warehouse<>();

        stringWarehouse.addItem("Laptop");
        stringWarehouse.addItem("Printer");
        stringWarehouse.addItem("Phone");

        System.out.println("View items in stock:" + " " + stringWarehouse.viewItems());

        System.out.println("Number of items:" + " " + stringWarehouse.getItemCount());

        System.out.println("Is the warehouse empty?" + " " + stringWarehouse.isEmpty());

        System.out.println("Removal from warehouse:" + " " + stringWarehouse.retrieveAll());

        System.out.println("Is the warehouse empty after the removal?" + " " + stringWarehouse.isEmpty());

        stringWarehouse.addItem("Computer mouse");
        System.out.println("After re-adding:" + " " + stringWarehouse.viewItems());

        stringWarehouse.clear();
        System.out.println("After clear():Is the warehouse is empty?" + " " + stringWarehouse.isEmpty());
    }
}
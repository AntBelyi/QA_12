package hw_7.Task_1;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        Warehouse<String> warehouse = new Warehouse<>(stringList);
        warehouse.addItem("Ann");
        warehouse.addItem("Olga");
        warehouse.addItem("Kola");

        System.out.println("List size " + warehouse.getItem());
        System.out.println("Return new list" + warehouse.viewItems());
        System.out.println("New list" + warehouse.retrieveAll());
        System.out.println("Return new list" + warehouse.viewItems());
        System.out.println("is empty " + warehouse.isEmpty());
        warehouse.clear();


    }


}

package hw7_1;

import java.util.ArrayList;
import java.util.List;

public class Warehouse<T> {
    private List<T> items;

    public Warehouse() {
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        items.add(item);
    }

    public int getItemCount() {
        return items.size();
    }

    public List<T> retrieveAll() {
        List<T> allItems = new ArrayList<>(items);
        items.clear();
        return allItems;
    }

    public List<T> viewItems() {
        return new ArrayList<>(items);
    }

    public boolean isEmpty() {
        return items.isEmpty();
    }

    public void clear() {
        if (items.isEmpty()) {
            System.out.println("The warehouse is empty");
        } else {
            System.out.println("The warehouse isn't empty");
        }
        items.clear();
    }
}
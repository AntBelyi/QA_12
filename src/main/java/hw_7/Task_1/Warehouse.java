package hw_7.Task_1;

import java.util.ArrayList;
import java.util.List;

public class Warehouse <T>{
    private List<T> listOfElements = new ArrayList<>();

    public Warehouse(List<T> listOfElements) {
        this.listOfElements = listOfElements;
    }

    public void addItem(T Item){
        listOfElements.add(Item);

    }
    public int getItem(){
        return listOfElements.size();
    }
    public List<T> retrieveAll() {
        List<T> result = new ArrayList<>(listOfElements);
        listOfElements.clear();
        return result;
    }
    public List<T> viewItems(){
        return new ArrayList<>(listOfElements);
    }
    public boolean isEmpty(){
        return listOfElements.isEmpty();
    }
    public void clear(){
        if (listOfElements.isEmpty()){
            System.out.println("The list is empty");
        }else {
            System.out.println("The list isn't empty");
        }
    }
}

package hw_8.Task_3;

import java.util.LinkedList;
import java.util.Queue;

public class ApplicationQueue {
    public static void main(String[] args) {
        Queue<String> stringQueue = new LinkedList<>();

        System.out.println("add element in list two methods");
        stringQueue.add("One");
        stringQueue.add("two");
        stringQueue.add("three");
        stringQueue.offer("four");
        stringQueue.offer("five");
        System.out.println(stringQueue);
        System.out.println("What is the first element? " + stringQueue.element());
        System.out.println("What is the first element? " + stringQueue.peek());
        System.out.println("Find end delete first element " + stringQueue.remove());
        System.out.println("Find end delete first element " + stringQueue.poll());
        System.out.println("New stringQueue " + stringQueue);
    }
}

package hw_8.Task_3;

import java.util.ArrayDeque;
import java.util.Deque;

public class ApplicationDequeue {
    public static void main(String[] args) {
        Deque<String> stringDeque = new ArrayDeque<>();
        stringDeque.add("One");
        stringDeque.add("two");
        stringDeque.add("three");
        stringDeque.add("four");
        stringDeque.offer("five");
        System.out.println(stringDeque);
        stringDeque.addFirst("six");
        stringDeque.push("seven");
        System.out.println(stringDeque);
        System.out.println("Similar methods to show first element  " + stringDeque.getFirst() + " " + stringDeque.peekFirst());
        System.out.println("Similar methods to show last element " + stringDeque.getLast() + " " + stringDeque.peekLast());
        String deleteFirstElement = stringDeque.pollFirst();
        System.out.println("Show and delete first element " + deleteFirstElement + " " + stringDeque);
        String deleteLastElement = stringDeque.pollLast();
        System.out.println("Show and delete last element " + deleteLastElement + " " + stringDeque);
    }
}

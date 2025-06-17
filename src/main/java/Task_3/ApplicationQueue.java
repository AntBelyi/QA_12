package hw8_3;

import java.util.LinkedList;
import java.util.Queue;

public class ApplicationQueue {
    public static void main(String[] args) {
        Queue<String> stringsQueue = new LinkedList<>();

        stringsQueue.add("Kyiv");
        stringsQueue.add("Lviv");
        stringsQueue.add("Odesa");
        stringsQueue.offer("Dnipro");
        stringsQueue.offer("Kharkiv");
        stringsQueue.offer("Zaporizhzhia");

        System.out.println(stringsQueue.element());
        System.out.println(stringsQueue);
        System.out.println(stringsQueue.peek());
        System.out.println(stringsQueue);
        System.out.println(stringsQueue.poll());
        System.out.println(stringsQueue);
        System.out.println(stringsQueue.remove());
        System.out.println(stringsQueue);
    }
}

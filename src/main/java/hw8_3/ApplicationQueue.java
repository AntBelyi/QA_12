package hw8_3;

import java.util.LinkedList;
import java.util.Queue;

public class ApplicationQueue {
    public static void main(String[] args) {
        Queue<String> stringsQueue = new LinkedList<>();

        stringsQueue.add("March");
        stringsQueue.add("April");
        stringsQueue.add("May");
        stringsQueue.offer("June");
        stringsQueue.offer("July");
        stringsQueue.offer("August");

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
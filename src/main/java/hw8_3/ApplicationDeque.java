package hw8_3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class ApplicationDeque {
    public static void main(String[] args) {

        Deque<String> stringsdeque = new ArrayDeque<>();

        stringsdeque.add("March");
        stringsdeque.add("April");
        stringsdeque.add("May");
        stringsdeque.offer("June");
        stringsdeque.offer("July");
        stringsdeque.offer("August");

        int index = 0;
        String resultValue = "";
        for (String Value : stringsdeque){
            if (index == 2){
                resultValue = Value;
            }
            index ++;
        }

        System.out.println(resultValue);
        System.out.println(stringsdeque);

        System.out.println(stringsdeque.getFirst());
        System.out.println(stringsdeque.getLast());
        System.out.println(stringsdeque);

        System.out.println(stringsdeque.pollFirst());
        System.out.println(stringsdeque.pollLast());
        System.out.println(stringsdeque);

        System.out.println(stringsdeque.peekFirst());
        System.out.println(stringsdeque.peekLast());
        System.out.println(stringsdeque);
    }
}
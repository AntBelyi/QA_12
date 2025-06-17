package hw8_3;

import java.util.ArrayDeque;
import java.util.Deque;

public class ApplicationDeque {
    public static void main(String[] args) {

        Deque<String> stringsdeque = new ArrayDeque<>();

        stringsdeque.add("Apple");
        stringsdeque.add("Banana");
        stringsdeque.add("Cherry");
        stringsdeque.offer("Date");
        stringsdeque.offer("Elderberry");
        stringsdeque.offer("Fig");

        int index = 0;
        String resultValue = "";
        for (String value : stringsdeque) {
            if (index == 2) {
                resultValue = value;
            }
            index++;
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

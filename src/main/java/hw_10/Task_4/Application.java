package hw_10.Task_4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Application {

    public static void main(String[] args) {
        String formattedTime = formatDateTime(LocalDateTime.of(2023, 12, 15, 19, 22), "dd-MM-yyyy HH:mm");
        System.out.println(formattedTime);
    }

    public static String formatDateTime(LocalDateTime dateTime, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return dateTime.format(formatter);
    }

}
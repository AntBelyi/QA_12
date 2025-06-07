package Task_4;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Application {
    public static String formatDateTime(LocalDateTime dateTime, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return dateTime.format(formatter);
    }

    public static void main(String[] args) {
        String formattedTime = formatDateTime(LocalDateTime.of(2024, 11, 19, 15, 30), "dd-MM-yyyy HH:mm");
        System.out.println(formattedTime);
    }
}
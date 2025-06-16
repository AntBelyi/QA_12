package hw_10.Task_2;

import java.time.LocalDateTime;

public class Application {

    public static void main(String[] args) {
        LocalDateTime input = LocalDateTime.of(2024, 11, 28, 16, 30);
        LocalDateTime result = calculateFutureDateTime(input, 5, 10);
        System.out.println(result);
    }

    public static LocalDateTime calculateFutureDateTime(LocalDateTime dateTime, int days, int hours) {
        return dateTime.plusDays(days).plusHours(hours);
    }

}
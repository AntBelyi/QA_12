package hw_10;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Application {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String date = localDateTime.format(dateTimeFormatter);
        System.out.println("Date in format: " + date);

        LocalDateTime dateTime = localDateTime.of(2025, 9, 3, 16, 50);
        LocalDateTime Start = localDateTime.of(2025, 4, 15, 13, 20);
        LocalDateTime end = localDateTime.of(2025, 4, 16, 16, 45);
        int days = -5;
        int hours = 8;
        String pattern = "dd-MM-yyyy HH:mm";

        calculateFutureDateTime(dateTime, days, hours);

        if (isWeekend(dateTime)) {
            System.out.println("true");
        }
        System.out.println("false");

        formatDataTime(dateTime, pattern);

        calculateDifference(Start, end);

    }

    public static void calculateFutureDateTime(LocalDateTime dateTime, int days, int hours) {
        LocalDateTime newDate = dateTime.plusDays(days).plusHours(hours);
        System.out.println("Method plus days and hours  " + newDate);
    }

    public static boolean isWeekend(LocalDateTime dateTime) {
        int weekend = dateTime.getDayOfWeek().getValue();
        System.out.println(weekend);
        return weekend == 6 || weekend == 7;
    }

    public static void formatDataTime(LocalDateTime dateTime, String pattern) {
        String date = dateTime.format(DateTimeFormatter.ofPattern(pattern));
        System.out.println(date);
    }

    public static void calculateDifference(LocalDateTime Start, LocalDateTime end) {
        Duration duration = Duration.between(Start, end);
        long days = duration.toDays();
        long hours = duration.toHours();
        long minutes = duration.toMinutesPart();
        String formattedDuration = String.format("%02d:%02d:%02d", days, hours, minutes);
        System.out.println("I don't found different format " + formattedDuration);
    }

}

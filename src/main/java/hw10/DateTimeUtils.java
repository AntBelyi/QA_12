import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeUtils {

    // 1) Print current date and time in format YYYY-MM-DD HH:MM:SS
    public static void printCurrentDateTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Current date and time: " + now.format(formatter));
    }

    // 2) Add or subtract days and hours to/from a given date-time
    public static LocalDateTime calculateFutureDateTime(LocalDateTime dateTime, int days, int hours) {
        return dateTime.plusDays(days).plusHours(hours);
    }

    // 3) Check if the given date is a weekend (Saturday or Sunday)
    public static boolean isWeekend(LocalDateTime dateTime) {
        DayOfWeek day = dateTime.getDayOfWeek();
        return day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY;
    }

    // 4) Format LocalDateTime according to a custom pattern
    public static String formatDateTime(LocalDateTime dateTime, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return dateTime.format(formatter);
    }

    // 5) Calculate difference between two date-time objects in days, hours, and minutes
    public static String calculateDifference(LocalDateTime start, LocalDateTime end) {
        Duration duration = Duration.between(start, end);
        long totalMinutes = duration.toMinutes();
        long days = totalMinutes / (24 * 60);
        long hours = (totalMinutes % (24 * 60)) / 60;
        long minutes = totalMinutes % 60;

        return String.format("Difference: %d days, %d hours, %d minutes", days, hours, minutes);
    }

    // Main method for testing
    public static void main(String[] args) {
        // 1) Print current date and time
        printCurrentDateTime();

        // 2) Add/subtract days and hours
        LocalDateTime updatedDateTime = calculateFutureDateTime(
                LocalDateTime.of(2023, 10, 25, 14, 30), 3, 5
        );
        System.out.println("Updated date and time: " + updatedDateTime);

        // 3) Check if date is weekend
        System.out.println("Is 2023-10-28 a weekend? " +
                isWeekend(LocalDateTime.of(2023, 10, 28, 10, 0)));
        System.out.println("Is 2023-10-30 a weekend? " +
                isWeekend(LocalDateTime.of(2023, 10, 30, 10, 0)));

        // 4) Format date and time
        String formatted = formatDateTime(
                LocalDateTime.of(2023, 10, 25, 14, 30), "dd-MM-yyyy HH:mm"
        );
        System.out.println("Formatted date: " + formatted);

        // 5) Calculate difference between two date-times
        String difference = calculateDifference(
                LocalDateTime.of(2023, 10, 25, 14, 30),
                LocalDateTime.of(2023, 10, 28, 16, 45)
        );
        System.out.println(difference);
    }
}

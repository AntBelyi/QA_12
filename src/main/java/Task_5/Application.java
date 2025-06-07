package Task_5;

import java.time.Duration;
import java.time.LocalDateTime;

public class Application {
    public static String calculateDifference(LocalDateTime start, LocalDateTime end) {
        Duration duration = Duration.between(start, end);
        long differenceDays = duration.toDays();
        long differenceHours = duration.toHours();
        long differenceMinutes = duration.toMinutes();
        return differenceDays + (differenceHours % 24) + (differenceMinutes % 60) + "difference" ;
    }

    public static void main(String[] args) {
        String diff = calculateDifference(
                LocalDateTime.of(2023, 10, 25, 14, 30),
                LocalDateTime.of(2023, 10, 28, 16, 45)
        );
        System.out.println(diff);
    }
}
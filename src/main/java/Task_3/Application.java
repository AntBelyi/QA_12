package Task_3;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Application {
    public static boolean isWeekend(LocalDateTime dateTime) {
        DayOfWeek day = dateTime.getDayOfWeek();
        return day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY;
    }

    public static void main(String[] args) {
        System.out.println("25.05.2024 — Is weekend? " + isWeekend(LocalDateTime.of(2024, 5, 25, 10, 0)));
        System.out.println("08.09.2025 — Is weekend? " + isWeekend(LocalDateTime.of(2025, 9, 8, 10, 0)));
    }
}
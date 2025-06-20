package hw_10.Task_3;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class Application {

    public static void main(String[] args) {
        System.out.println("16.06.2025 — Is weekend? " + isWeekend(LocalDateTime.of(2025, 6, 16, 11, 0))); // Monday
        System.out.println("22.06.2025 — Is weekend? " + isWeekend(LocalDateTime.of(2025, 6, 22, 11, 0))); // Sunday
    }

    public static boolean isWeekend(LocalDateTime dateTime) {
        DayOfWeek day = dateTime.getDayOfWeek();
        return day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY;
    }

}

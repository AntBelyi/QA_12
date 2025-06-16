package hw_10.Task_1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Application {

    public static void main(String[] args) {
        currentDateTime();
    }

    public static void currentDateTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("formatter:" + " " + localDateTime.format(formatter));
    }

}
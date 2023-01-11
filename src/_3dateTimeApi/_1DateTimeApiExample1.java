package _3dateTimeApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Locale;

public class _1DateTimeApiExample1 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println("date = " + date); // date = 2023-01-11

        LocalTime time = LocalTime.now();
        System.out.println("time = " + time); // time = 13:22:24.961448800

        // get day, month, year
        System.out.println(date.getYear()); // 2023
        System.out.println(date.getMonth()); // JANUARY
        System.out.println(date.getMonthValue()); // 1
        System.out.println(date.getDayOfWeek()); // WEDNESDAY
        System.out.println(date.getDayOfMonth()); // 11
        System.out.println(date.getDayOfYear()); // 11

        // get hr, min, sec
        System.out.println("Hour: " + time.getHour());
        System.out.println("Minute: " + time.getMinute());
        System.out.println("Second: " + time.getSecond());
        System.out.println("Mile Second: " + time.getNano());

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("dateTime = " + dateTime); // 2023-01-11T13:27:15.584970600

        // future date
        LocalDateTime futureDateTime = LocalDateTime.of(2080, 6, 20, 5, 30, 6);
        LocalDateTime futureDateTime2 = LocalDateTime.of(2080, Month.JUNE, 20, 5, 30, 6);
        System.out.println("futureDateTime = " + futureDateTime);
    }
}

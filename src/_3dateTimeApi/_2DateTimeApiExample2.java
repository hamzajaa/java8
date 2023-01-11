package _3dateTimeApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.MonthDay;

public class _2DateTimeApiExample2 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.now();
        System.out.println("date after 15 days = " + date.plusDays(15));
        System.out.println("date after 2 months = " + date.plusMonths(2));
        System.out.println("date after 5 years = " + date.plusYears(5));

        System.out.println("date before 10 days = " + date.minusDays(10));
        System.out.println("date before 2 months = " + date.minusMonths(2));
        System.out.println("date before 3 years = " + date.minusYears(3));

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("dateTime = " + dateTime);

        // date after 40 days
        System.out.println("dateTime After 40 days: " + dateTime.plusDays(40));

        System.out.println("dateTime before 2 hrs: " + dateTime.minusHours(2));
    }
}

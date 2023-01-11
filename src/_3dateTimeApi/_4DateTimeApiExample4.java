package _3dateTimeApi;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class _4DateTimeApiExample4 {

    public static void main(String[] args) {

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("My current time zone: " + zoneId);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Local date and time: " + dateTime);

        // get TimeZone Of Los Angeles
        ZoneId zoneIdLA = ZoneId.of("America/Los_Angeles");
        System.out.println("Time Zone At LA = " + LocalDateTime.now(zoneIdLA));

        System.out.println("Time Zone At LA = " + ZonedDateTime.now(zoneIdLA));

        ZoneId zoneIdGMT = ZoneId.of("GMT+05:30");
        System.out.println("Time Zone At GMT+05:30 = " + ZonedDateTime.now(zoneIdGMT));

        ZoneId zoneIdGMT00 = ZoneId.of("GMT");
        System.out.println("Time Zone At GMT = " + ZonedDateTime.now(zoneIdGMT00));

        System.out.println(Instant.now()); // same as GMT

    }
}

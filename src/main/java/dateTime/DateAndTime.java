package dateTime;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateAndTime {

    public static void main(String[] args) {

        LocalDateTime currentTime = LocalDateTime.now();

        System.out.println(currentTime);
        System.out.println(currentTime.getDayOfYear());

        String someDate = "2010/03/13 20:32";
        String format = "yyyy/MM/dd HH:mm";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
        LocalDateTime someDateParsed = LocalDateTime.parse(someDate, formatter);

        System.out.println("Jakas data to " + someDateParsed);
        System.out.println("Czy teraz jest przed jakas 2020/03/13 20:32?" + currentTime.isBefore(someDateParsed));

        Period period = Period.between(someDateParsed.toLocalDate(),currentTime.toLocalDate());
        int daysBetweenTwoDates = period.getYears();
        System.out.println("Roznica w latach " + daysBetweenTwoDates);
    }
}

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime now =  LocalDateTime.now();
        System.out.println(now);
        LocalDateTime ofNow =  LocalDateTime.of(2025,9,04,18,0,0);
        System.out.println(ofNow);
        LocalDate localDate = now.toLocalDate();
        LocalTime localTime = now.toLocalTime();
        System.out.println(localDate);
        System.out.println(localTime);
        LocalDateTime plusDay = now.plusDays(10);
        System.out.println(plusDay);
        System.out.println(plusDay.isBefore(now));
        System.out.println(plusDay.isAfter(now));
        System.out.println(plusDay.isEqual(now));
    }
}

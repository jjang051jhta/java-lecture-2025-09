import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2025,9,5,15,40,0);
        System.out.println(localDateTime.get(ChronoField.YEAR));
        System.out.println(localDateTime.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(localDateTime.get(ChronoField.DAY_OF_MONTH));
        System.out.println("========================================");
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.getMonth());
        System.out.println(localDateTime.getMonth().getValue());
        System.out.println(localDateTime.getMonthValue());
        System.out.println(localDateTime.getDayOfMonth());
        System.out.println(localDateTime.getHour());
        System.out.println(localDateTime.getMinute());
        System.out.println(localDateTime.getSecond());
        System.out.println(localDateTime.get(ChronoField.MINUTE_OF_DAY));





    }
}

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeMain {
    public static void main(String[] args) {
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        ZonedDateTime zonedDateTime02 =  ZonedDateTime.of(localDateTime, ZoneId.of("America/Vancouver"));
        System.out.println(zonedDateTime02);
        //
    }
}

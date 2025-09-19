package review04.time;

import java.time.*;
import java.util.Calendar;

public class LocalDateMain {
    //
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        LocalDate ofDate = LocalDate.of(2025,12,25);
        System.out.println(ofDate);
        LocalDate plusDays = now.plusDays(15);
        System.out.println(plusDays); //불변 객체
        //Calendar.getInstance() 가변객체
        LocalDateTime now02 = LocalDateTime.now();
        System.out.println(now02);
        LocalDate localDate = now02.toLocalDate();
        LocalTime localTime = now02.toLocalTime();
        System.out.println(localDate);
        System.out.println(localTime);
        LocalDateTime now03 = LocalDateTime.of(localDate,localTime);
        System.out.println(now03);
        LocalDateTime localDateTime = LocalDateTime.of(2025,9,18,13,0,0);
        LocalDateTime localDateTime02 = LocalDateTime.of(2025,9,18,13,0,0);
        System.out.println(now02.isAfter(localDateTime));
        System.out.println(now02.isBefore(localDateTime));
        System.out.println(localDateTime.isEqual(localDateTime02));
        System.out.println(localDateTime.equals(localDateTime02));
        OffsetDateTime offsetDateTime01 = localDateTime.atOffset(ZoneOffset.ofHours(0));
        OffsetDateTime offsetDateTime02 = localDateTime.atOffset(ZoneOffset.ofHours(9));
        System.out.println("offsetDateTime01==="+offsetDateTime01);
        System.out.println("offsetDateTime02==="+offsetDateTime02);

        //UTC 0 UTC +9
        System.out.println("equals==="+offsetDateTime01.equals(offsetDateTime02));  //타입도 따진다. 엄격하게 따진다.
        System.out.println("isEqual==="+offsetDateTime01.isEqual(offsetDateTime02));  //이건 비교 대상이 시간이 같으면 true
        System.out.println("==================");
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId); // 타임존
        ZoneId seoul = ZoneId.of("Asia/Seoul");
        System.out.println(seoul);
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
    }
}

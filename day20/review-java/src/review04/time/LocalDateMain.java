package review04.time;

import java.time.*;
import java.time.temporal.ChronoUnit;
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
        OffsetDateTime offsetDateTime01 = localDateTime.atOffset(ZoneOffset.UTC);
        OffsetDateTime offsetDateTime02 = offsetDateTime01.withOffsetSameInstant(ZoneOffset.ofHours(9));
        System.out.println("offsetDateTime01==="+offsetDateTime01);
        System.out.println("offsetDateTime02==="+offsetDateTime02);

        //UTC 0 UTC +9
        System.out.println("equals==="+offsetDateTime01.equals(offsetDateTime02));    //타입도 따진다. 엄격하게 따진다.
        System.out.println("isEqual==="+offsetDateTime01.isEqual(offsetDateTime02));  //이건 비교 대상이 시간이 같으면 true
        System.out.println("==================");
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId); // 타임존
        ZoneId seoul = ZoneId.of("Asia/Seoul");
        System.out.println(seoul);
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);
        System.out.println("======================");
        //Duration(시분초),Period(년월일)  시간의 간격을 구할때 쓴다.
        // 2025.9.19  정확한 시간
        // 지금부터 5개월 공부해야돼
        // 프로젝트가 3개월 남았어
        //  라면은 3분동안 끊이면 맛있어
        Period period = Period.ofDays(10);
        System.out.println("period === "+period); //10일
        LocalDate now04 = LocalDate.of(2030,1,1);
        LocalDate plusDate = now04.plus(period);
        System.out.println(now04);
        System.out.println(plusDate);

        LocalDate startDate = LocalDate.of(2025,9,19);
        LocalDate endDate = LocalDate.of(2026,2,10);
        Period between =  Period.between(startDate,endDate);
        //System.out.println(between.getYears()+"년 "+between.getMonths()+"월 "+between.getDays()+"일 남았습니다.");
        System.out.println(ChronoUnit.DAYS.between(startDate,endDate)+"일 남았습니다.");
        System.out.println("=====================================");
        Duration duration = Duration.ofMinutes(30);
        System.out.println("duration = "+duration);
        LocalTime localTime02 =  LocalTime.of(1,0);
        System.out.println(localTime02.plus(duration));
        //퀴즈  18:00까지 남은 시간 카운트 다운 1초마다 한번 씩 출력  thread
    }
}

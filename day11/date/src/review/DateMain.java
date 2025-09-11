package review;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class DateMain {
    public static void main(String[] args) {
        //자바에 날짜 또는 시간 관련 class
        //불변객체...  Calendar 객체는 쓰지 않는다. 웬만하면...
        LocalDate localDate = LocalDate.now(); //현재 날짜
        System.out.println(localDate);
        LocalDate targetLocalDate = LocalDate.of(2025, 12, 25); //현재 날짜
        System.out.println(targetLocalDate);
        LocalDate plus10Day = localDate.plusDays(10);
        System.out.println(localDate);
        System.out.println(plus10Day);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalTime targetLocalTime = LocalTime.of(12, 0, 0);
        System.out.println(targetLocalTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDate localDate02 = localDateTime.toLocalDate();
        LocalTime localTime02 = localDateTime.toLocalTime();
        System.out.println(localDate02 + " / " + localTime02);
        LocalDateTime localDateTime02 = LocalDateTime.of(localDate02, localTime02);
        System.out.println(localDateTime02);

        //Instant  1970.1.1 00:00  EpochTime timestamp 전세계 공통

        Instant instant = Instant.now();
        System.out.println("instant===" + instant);

        LocalDate xmas = LocalDate.of(2025, 12, 25);
        LocalDate now = LocalDate.now();
        long diff = xmas.toEpochDay() - now.toEpochDay();
        System.out.println("dday==="+diff);

        //Duration 시분초 / Period  년월일
        Period period = Period.ofDays(111);
        System.out.println("period === "+period);

        LocalDate now03 = LocalDate.now();
        LocalDate plusDate111 =  now03.plus(period); //plus()
        System.out.println("현재 날짜 === "+now03);
        System.out.println("111일 이후 === "+plusDate111);

        LocalDate newYear = LocalDate.of(2026,1,1);
        Period between =  Period.between(now03,newYear);
        System.out.println(between.getYears()+" / "+between.getMonths()+" / "+between.getDays());
        long between02 =  newYear.toEpochDay() - now03.toEpochDay();
        long between03 = ChronoUnit.DAYS.between(now,newYear);

        System.out.println("새해까지 === "+between02+"일 남았습니다.");
        System.out.println("새해까지 === "+between03+"일 남았습니다.");

        //enum  상수 (열거형) 오타방지 (type safe)
        Season season = Season.FALL;
        System.out.println(season);
        System.out.println(season.ordinal()); //숫자로 돌려받고 싶다.
        System.out.println(season.name()); //숫자로 돌려받고 싶다.
        System.out.println(season.name()); //숫자로 돌려받고 싶다.
        System.out.println(Season.WINTER.getDisplayName().equals("겨울")); //숫자로 돌려받고 싶다.
        System.out.println(Season.WINTER.getCode()); //숫자로 돌려받고 싶다.
    }
}

package test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Test02 {
    public static void main(String[] args) {
        /*
        LocalDateTime deadline 기준으로
        지금이 마감 전이면 "D-n"(일 단위 내림, 0이면 "D-Day")
        마감 지났으면 "D+ n" 을 반환하라. (분·시간 단위 무시, 날짜 기준)
        */
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime minus3 = now.minusDays(3);
        LocalDateTime plus3 = now.plusDays(3);
        LocalDateTime xmas = LocalDateTime.of(2025,12,25,0,0,0);
        System.out.println(showDDay(minus3,now));
        System.out.println(showDDay(plus3,now));
        System.out.println(showDDay(xmas,now));
    }

    public static String showDDay(LocalDateTime dday, LocalDateTime now) {
        LocalDate d01 = now.toLocalDate();
        LocalDate d02 = dday.toLocalDate();
        long remainDays = ChronoUnit.DAYS.between(d02, d01);
        if (remainDays < 0) {
            return "D-" + Math.abs(remainDays);  //|-123|   123
        } else if (remainDays > 0) {
            return "D+" + remainDays;
        }
        return "D-Day";
    }
}

package test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Test03 {
    public static void main(String[] args) {
        //하루 근무 시작·종료 LocalDateTime start/end가 주어지고,
        //중간에 12:00~13:00은 휴게로 제외한다. 총 근무 시간을 분 단위로 반환하라.
        //09:00 ~ 18:800
        LocalDate today = LocalDate.now();
        LocalDateTime start =  LocalDateTime.of(today, LocalTime.of(9,00));
        LocalDateTime end =  LocalDateTime.of(today, LocalTime.of(18,0));
        LocalDateTime lunchStart = LocalDateTime.of(start.toLocalDate(),LocalTime.of(12,0));
        LocalDateTime lunchEnd = LocalDateTime.of(start.toLocalDate(),LocalTime.of(13,0));
        LocalDateTime start02 = start.isBefore(lunchStart) ? start : lunchStart;
        LocalDateTime end02 = end.isAfter(lunchEnd) ? end : lunchEnd;
        System.out.println(Duration.between(start,end).toMinutes() - 60);
        //System.out.println(start.isAfter(lunchStart));
        //System.out.println(start+" / "+lunchStart);
        //System.out.println(Duration.between(start02,end02).toMinutes());

    }
}

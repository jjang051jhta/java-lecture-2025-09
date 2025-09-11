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
        LocalDateTime start =  LocalDateTime.of(today, LocalTime.of(9,30));
        LocalDateTime end =  LocalDateTime.of(today, LocalTime.of(18,0));
        LocalDateTime lunchStart = LocalDateTime.of(start.toLocalDate(),LocalTime.of(12,0));
        LocalDateTime lunchEnd = LocalDateTime.of(start.toLocalDate(),LocalTime.of(13,0));

        //전체 근무시간
        Duration total =  Duration.between(start,end);
        System.out.println("전체 근문 시간 : "+total.toMinutes());

        //겹치는 구간 연산
        LocalDateTime overlapStart = start.isAfter(lunchStart) ? start: lunchStart;
        LocalDateTime overlapEnd = end.isBefore(lunchEnd) ? end: lunchEnd;
        System.out.println(overlapStart+" / "+overlapEnd);
        Duration overlapTime = Duration.between(overlapStart,overlapEnd);
        System.out.println("overlapTime : "+overlapTime.toMinutes());
        System.out.println("총 근무시간 : "+total.minus(overlapTime).toMinutes());


    }
}

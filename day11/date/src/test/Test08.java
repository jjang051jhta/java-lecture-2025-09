package test;

import java.time.LocalDateTime;

public class Test08 {
    public static void main(String[] args) {
        //8. LocalDateTime t를 가까운 15분 단위로 반올림한 결과를 반환하라.
        //예) 10:07 → 10:00, 10:08 → 10:15
        LocalDateTime t01 =  LocalDateTime.of(2025,9,5,10,45);
        int minute = t01.getMinute();
        int modMinute = minute % 15; //10:17 10:00  //10:15
        int roundMinute =  modMinute >= 8 ? 15 - modMinute : -modMinute;
        System.out.println("roundMinute==="+roundMinute);
        LocalDateTime roundTime = t01.plusMinutes(roundMinute).withSecond(0);
        System.out.println(roundTime);
    }
}

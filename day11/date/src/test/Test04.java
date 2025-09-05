package test;

import java.time.LocalDate;
import java.time.Period;

public class Test04 {
    public static void main(String[] args) {
        //생일 LocalDate birth가 주어질 때,만 나이(오늘 기준)
        //다음 생일까지 남은 Period(년/월/일) 을 구하라.
        LocalDate birth = LocalDate.of(1990, 9, 1);
        LocalDate today = LocalDate.now();
        int age = Period.between(birth,today).getYears();
        LocalDate nextBirth = birth.withYear(today.getYear());
        if(!nextBirth.isAfter(today)) {
            nextBirth = nextBirth.plusYears(1);
        }
        Period until  = Period.between(today,nextBirth);
        System.out.println(until);
        //String str = "";
        StringBuilder stringBuilder = new StringBuilder();
        if(until.getYears()>0) {
            stringBuilder.append(until.getYears()).append("년");
        }
        if(until.getMonths()>0) {
            stringBuilder.append(until.getMonths()).append("개월");
        }
        if(until.getDays()>0) {
            stringBuilder.append(until.getDays()).append("일");
            //str+=until.getDays()+"일";
        }
        stringBuilder.append("남음");
        System.out.println(stringBuilder.toString());

    }
}

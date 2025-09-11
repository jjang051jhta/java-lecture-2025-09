package test;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class Test06 {
    public static void main(String[] args) {
        //6.오늘부터 해당 달의 말일까지 남은 평일(월~금) 개수를 구하라. (공휴일 제외)
        LocalDate now = LocalDate.now();
        LocalDate end = now.withDayOfMonth(now.lengthOfMonth());
        System.out.println("now.lengthOfMonth()==="+now.lengthOfMonth()); //이 달의 마지막 날짜
        int count = 0;
        for(LocalDate d = now;!d.isAfter(end);d=d.plusDays(1)) {
            //count++;
            //System.out.print(count+",");
            DayOfWeek dayOfWeek = d.getDayOfWeek(); //enum
            System.out.println(dayOfWeek);
            if(dayOfWeek !=DayOfWeek.SATURDAY && dayOfWeek !=DayOfWeek.SUNDAY) count++;

        }
        System.out.println(count);
    }
}

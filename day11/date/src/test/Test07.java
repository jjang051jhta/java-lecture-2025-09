package test;

import java.time.Duration;
import java.time.LocalDateTime;

public class Test07 {
    public static void main(String[] args) {
        //7.두 구간 [s1, e1], [s2, e2](모두 LocalDateTime)이 주어질 때 겹치는지 여부 겹친 시간(분) 을 반환하라.
        //15시
        //s1 12
        //e1 14   12 ~ 14
        //s2 13
        //e2 14   13 ~ 14
        LocalDateTime s1 = LocalDateTime.now().minusHours(3);
        LocalDateTime e1 = LocalDateTime.now().minusHours(1);
        LocalDateTime s2 = LocalDateTime.now().minusHours(2).plusMinutes(30);
        LocalDateTime e2 = LocalDateTime.now().minusHours(1);
        System.out.println(s1);
        System.out.println(e1);
        System.out.println(s2);
        System.out.println(e2);

        LocalDateTime start = s1.isAfter(s2) ? s1 : s2; //늦은 시작
        LocalDateTime end = e1.isBefore(e2) ? e1 : e2;  //빠른 종료
        System.out.println("start : "+start+"=== end : "+end);
        //겹치는지 아닌지...
        boolean overlap  =  !end.isBefore(start); //end >= start 이면 겹침
        System.out.println(overlap);
        long minute = Duration.between(start,end).toMinutes();
        System.out.println(minute);



    }
}

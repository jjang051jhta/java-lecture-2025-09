package test;

import java.time.Duration;
import java.time.LocalDateTime;

public class Test05 {
    public static void main(String[] args) {
        //LocalDateTime event와 LocalDateTime now로부터 "n시간 m분 s초 전" 문자열을 만들어라.
        //(n=0이면 해당 단위 생략 가능)
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime event = now.minusHours(2).minusMinutes(5).minusSeconds(20);
        System.out.println(now);
        System.out.println(event);
        Duration duration = Duration.between(event,now);
        System.out.println(duration);
        System.out.println(duration.toHours()+"시간 "+duration.toMinutesPart()+"분 "+duration.toSecondsPart());
        System.out.println("duration.getSeconds()==="+duration.getSeconds());
        long seconds = duration.getSeconds();
        long second =  seconds % 60;
        long minute =  (seconds % (60*60)) / 60;
        long hour =  seconds / (60*60);
        System.out.println(hour+"시간 "+minute+"분 "+second);
    }
}

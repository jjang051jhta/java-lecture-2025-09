package test;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test01 {
    public static void main(String[] args) {
        /*
        LocalDateTime postTime과 LocalDateTime now가 주어질 때,
        1시간 미만: "방금 전"
        1시간 이상 24시간 미만: "n시간 전"
        1일 이상 7일 미만: "n일 전"
        7일 이상은 그냥 쓴 날짜와 시간을 출력하시오.
         */
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime minus30Min = now.minusMinutes(60); //임의의 시간 현재 시간에서 30분 전
        LocalDateTime minus3Hour = now.minusHours(3);
        LocalDateTime minus2Day = now.minusDays(2);
        LocalDateTime minus10Day = now.minusDays(10);
        System.out.println(showBoardTime(minus30Min, now));
        System.out.println(showBoardTime(minus3Hour, now));
        System.out.println(showBoardTime(minus2Day, now));
        System.out.println(showBoardTime(minus10Day, now));


    }

    private static String showBoardTime(LocalDateTime postingTime, LocalDateTime now) {
        Duration duration = Duration.between(postingTime, now);
        long minutes =  duration.toMinutes();
        long hours = duration.toHours();
        long days = duration.toDays();
        if(minutes<60) {
            return "방금 전";
        } else if(hours < 24) {
            return hours+"시간 전";
        } else if (days < 7) {
            return days+"일 전";
        } else {
            return postingTime.format(DateTimeFormatter.ofPattern("yyyy년MM월dd일 HH:mm"));
        }
    }
}

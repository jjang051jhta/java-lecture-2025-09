import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationMain {
    public static void main(String[] args) {
        Duration duration = Duration.ofMinutes(30);
        System.out.println(duration);
        LocalTime now = LocalTime.now();
        LocalTime plus30Min = now.plus(duration);
        System.out.println(plus30Min);
        //간단퀴즈   09:30~18:00 몇시간 공부햇는지 출력
        LocalTime start = LocalTime.of(9,30);
        LocalTime end = LocalTime.of(17,50);
        Duration studyTime = Duration.between(start,end);
        System.out.println(studyTime.toHours()+"==="+studyTime.toMinutesPart());
        //현재 시간에서
        //글쓴 시간을 3개  10분전 30분전 5시간전에 글을 썼다고 가정하고
        //10분전 글은 방금전 30분전은 30분전 1시간 이후는 그냥 시간 출력하기
        LocalDateTime now02 = LocalDateTime.now();
        LocalDateTime postingTime =  LocalDateTime.of(2025,9,3,15,40,0);
        Duration duration02 =  Duration.between(postingTime,now02);
        long minutes = duration02.toMinutes();
        long hours = duration02.toHours();
        long days =  duration02.toDays();
        if(minutes < 10) {
            System.out.println("방금 전");
        } else if(minutes<30) {
            System.out.println("30분 전");
        } else {
            System.out.println(postingTime);
        }
    }
}

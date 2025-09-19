package review04.time;

import java.time.Duration;
import java.time.LocalDateTime;

public class CountDownMain {
    public static void main(String[] args) {
        Thread thread = new Thread(new CountDownTask());
        thread.start();
    }
}

class CountDownTask implements Runnable {

    @Override
    public void run() {
        try {
            while (true) {
                //System.out.println("zzz");
                LocalDateTime now = LocalDateTime.now();
                LocalDateTime end = LocalDateTime.of(2025, 9, 19, 17, 50, 0);
                Duration duration = Duration.between(now, end);
                /*
                long hour = duration.toHours();
                long minutes = duration.toMinutes() % 60;
                long seconds = duration.getSeconds() % 60;  //second와 nanoSecond만 있다.
                */
                long hour = duration.toHoursPart();
                long minutes = duration.toMinutesPart();
                long seconds = duration.toSecondsPart();  //second와 nanoSecond만 있다.
                //System.out.println(hour + ":" + minutes + ":" + seconds);
                System.out.printf("%02d:%02d:%02d",hour,minutes,seconds);
                System.out.println();
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("종료되었습니다.");
        }
    }
}

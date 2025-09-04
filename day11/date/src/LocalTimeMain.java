import java.time.LocalTime;

public class LocalTimeMain {
    public static void main(String[] args) {
        LocalTime nowTime = LocalTime.now();
        System.out.println(nowTime);
        LocalTime ofTime = LocalTime.of(18,00,00);
        System.out.println(ofTime);
        LocalTime plus4Hour = nowTime.plusHours(4);
        System.out.println(plus4Hour);
    }
}

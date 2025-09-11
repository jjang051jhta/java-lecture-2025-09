import java.time.Instant;

public class InstantMain {
    public static void main(String[] args) {
        //어느 시점(1970.1.1 00)을 기준으로 흘러온 초
        Instant now =  Instant.now();
        System.out.println(now);
        Instant epochStart =  Instant.ofEpochSecond(0);
        System.out.println("epochStart === "+epochStart);
        //로그 작성
        //
    }
}

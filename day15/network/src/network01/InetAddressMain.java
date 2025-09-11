package network01;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressMain {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress localhost = InetAddress.getByName("localhost");
        System.out.println(localhost);

        InetAddress google = InetAddress.getByName("google.com");
        System.out.println(google);

        InetAddress naver = InetAddress.getByName("naver.com");
        System.out.println(naver);

        InetAddress daum = InetAddress.getByName("daum.net");
        System.out.println(daum);





    }
}

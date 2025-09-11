package ex06;

import ex04.NetworkClientException04;
import ex06.exception.ConnectionException06;
import ex06.exception.SendException06;

import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) throws NetworkClientException04 {

        NetworkService06 networkService06 = new NetworkService06();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자 : ");
            String input = scanner.nextLine();
            if(input.equals("exit")) break;
            try {
                networkService06.sendMessage(input);
            } catch (Exception e) {
                //아이디가 없습니다.
                //아이디 또는 비밀번호가 맞지 않습니다.
                System.out.println("사용자 메세지 : 알 수 없는 오류가 발생하였습니다.");
                System.out.println("===개발자용 디버깅 메세지====");
                //e.printStackTrace();
                e.printStackTrace(System.out);
                if(e instanceof SendException06 sendException) {
                    System.out.println("[전송 오류] 전송데이터 : "+sendException.getSendData());
                } else if(e instanceof ConnectionException06 connectionException06) {
                    System.out.println("[연결 오류] 주소 : "+connectionException06.getAddress());
                }
            }
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}

package ex04;

import java.util.Scanner;

public class Main04 {
    public static void main(String[] args) throws NetworkClientException04 {
        //서비스가 핵심로직  business logic
        //NetworkService02 networkService02 = new NetworkService02();
        //NetworkService0202 networkService0202 = new NetworkService0202();
        //NetworkService0402 networkService0402 = new NetworkService0402();
        NetworkService0403 networkService0403 = new NetworkService0403();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자 : ");
            String input = scanner.nextLine();
            if(input.equals("exit")) break;
            networkService0403.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}

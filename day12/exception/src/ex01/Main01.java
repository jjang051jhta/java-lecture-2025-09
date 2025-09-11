package ex01;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        //서비스가 핵심로직  business logic
        NetworkService01 networkService01 = new NetworkService01();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자 : ");
            String input = scanner.nextLine();
            if(input.equals("exit")) break;
            networkService01.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}

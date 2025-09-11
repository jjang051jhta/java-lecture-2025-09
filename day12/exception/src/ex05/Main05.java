package ex05;

import ex04.NetworkClientException04;
import ex04.NetworkService0403;

import java.util.Scanner;

public class Main05 {
    public static void main(String[] args) throws NetworkClientException04 {

        NetworkService05 networkService05 = new NetworkService05();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자 : ");
            String input = scanner.nextLine();
            if(input.equals("exit")) break;
            networkService05.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}

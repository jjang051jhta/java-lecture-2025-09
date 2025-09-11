package test;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("10부터 99사이의 정수를 입력하시오.");
        int num = scanner.nextInt();
        int num01 = num / 10; //십의 자리
        int num02 = num % 10; //일의 자리
        if(num01==num02) {
            System.out.println("일의 자리와 십의 자리가 같습니다.");
            return;
        }
        System.out.println("일의 자리와 십의 자리가 다릅니다.");

        scanner.close();
        scanner = null;
    }
}

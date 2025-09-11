package test;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        /*
        1. Scanner 클래스를 이용하여 입력받은 원화 값을 달러로 바꾸어
        다음 예시와 같이 출력하는 프로그램을 작성하라.
        ($1=1300원으로 가정) 원화를 입력하세요(단위 원) >> 3300

        3300원은 $3.0입니다.
         */
        Scanner scanner = new Scanner(System.in);
        int won = scanner.nextInt();
        double dollar =  won/1300.0;
        double result = (int)(dollar*100)/100.0;

        System.out.println(won+"원은 $"+result+"입니다.");
        System.out.printf("%d원은 $%.2f달러입니다.",won,dollar);
        scanner.close();
        scanner = null;
    }
}

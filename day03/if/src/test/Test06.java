package test;

import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
//        6. 369게임을 간단히 작성해보자. 1~99까지의 정수를 입력받고
//        정수에 3,6,9 중 하나가 있는 경우는 "박수짝"을 출력하고
//        두 개 있는 경우는 "박수짝짝"을 출력하는 프로그램을 작성하라.
//        예를 들면, 키보드로 입력된 수가 13인 경우 "박수짝"을,
//                36인 경우 "박수짝짝"을 출력하면 된다.
//
//        1~99 사이의 정수를 입력하시오 >> 36
//
//        박수짝짝
        Scanner scanner = new Scanner(System.in);
        System.out.println("1~99까지의 정수 입력");
        int num = scanner.nextInt();
        int first = num / 10; //십의 자리수
        int second = num % 10;
        int count = 0;
        if (first != 0 && first % 3 == 0) {
            //count = count + 1;
            //count+=1;
            count++;
        }
        if(second!=0 && second%3==0) {
            count++;
        }
        if(count==1) {
            System.out.println("박수 짝");
        } else if(count==2) {
            System.out.println("박수 짝짝");
        }
    }
}

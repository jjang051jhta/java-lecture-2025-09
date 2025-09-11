package test;

import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {

//        7. 숫자를 입력받아 3~5는 봄, 6~8은 여름, 9~11은 가을, 12,1,2는 겨울,
//        그 외의 숫자를 입력한 경우 잘못입력을 출력하는 프로그램을 작성하라.
//        if-else 문과 switch 둘 다 이용해볼 것.
//
//        달을 입력하세요(1~12) >> 9
//
//        가을
        Scanner scanner = new Scanner(System.in);
        System.out.println("1~12사이의 숫자를 입력하세요");
        int num = scanner.nextInt();
        /*
        switch(num) {
            case 12:            case 1:            case 2:
                System.out.println("겨울");
                break;
            case 3:            case 4:            case 5:
                System.out.println("봄");
                break;
            case 6:            case 7:            case 8:
                System.out.println("여름");
                break;
            case 9:            case 10:            case 11:
                System.out.println("가을");
                break;
            default:
                System.out.println("잘못입력하셨습니다.");
        }

         */
        String season = switch(num) {
            case 12,1,2 -> "겨율";
            case 3,4,5 -> "봄";
            case 6, 7,8 -> "여름";
            case 9,10,11 -> "가을";
            default -> "잘못입력하셨습니다.";
        };
        System.out.println(season);
    }
}

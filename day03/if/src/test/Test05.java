package test;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int center;
        //2, 1, 3
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        //모두 만족해야한다면 셋중에 하나라도 만족하면 안된다.
        if (a + b > c && a + c > b && b + c > a) {
            System.out.printf("%d,%d,%d는 삼각형이 될 수 있습니다. \n",a,b,c);
        } else {
            System.out.printf("%d,%d,%d는 삼각형이 될 수 없습니다. \n",a,b,c);
        }

        System.out.println("====================");
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.printf("%d,%d,%d는 삼각형이 될 수 없습니다.",a,b,c);
        } else {
            System.out.printf("%d,%d,%d는 삼각형이 될 수 있습니다.",a,b,c);
        }
        //switch으로 바꾼다면....
        int isValid;
        if(a + b <= c || a + c <= b || b + c <= a) {
            isValid = 1;
        } else {
            isValid = 0;
        }
        isValid = (a + b <= c || a + c <= b || b + c <= a) ? 1 : 0;
        switch (isValid) {
            case 1 -> {
                System.out.printf("%d,%d,%d는 삼각형이 될 수 없습니다. \n",a,b,c);
            }
            case 2 -> {
                System.out.printf("%d,%d,%d는 삼각형이 될 수 있습니다. \n",a,b,c);
            }
            default -> {
                System.out.println("???");
            }
        }
    }
}

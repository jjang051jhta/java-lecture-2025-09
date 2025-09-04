package test;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int center;
        //2, 1, 3
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a >= b && a <= c || a>=c && a<=b) {
            center = a;
        } else if(b >= a && b <= c || b>=c && b<=a){
            center = b;
        } else {
            center = c;
        }
        System.out.printf("세 숫자 %d,%d,%d 중 중간값은 %d",a,b,c,center);
    }
}

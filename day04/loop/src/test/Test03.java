package test;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        /*
        3. Scanner를 이용하여 정수를 입력받고 다음과 같이 *를 출력하는 프로그램을 작성하라.
        다음은 5를 입력받았을 경우이다.

        정수를 입력하시오 >> 5

        *****
        ****
        ***
        **
        *
         */
        Scanner scanner = new Scanner(System.in);
        //int star = scanner.nextInt();
        int star = 10;
        //i=0 *
        //i=1 **
        //i=2 ***
        for (int i = 0; i <star; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

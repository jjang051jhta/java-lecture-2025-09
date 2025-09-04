package test;

import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        //9. 문자열을 입력받아 한 글자씩 회전시켜 모두 출력하는 프로그램을 작성하라.
        //System.out.println("문장을 입력하세요.");
        //Scanner scanner = new Scanner(System.in);
        String str = "I LOVE JAVA ";
        for(int i=0;i<str.length();i++) {
            String first = str.substring(0, 1);
            String last = str.substring(1);
            str = last + first;
            System.out.println(str);
        }
        //I LOVE JAVA
        //LOVE JAVA I
        //OVE JAVA I L
    }
}

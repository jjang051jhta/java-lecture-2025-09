package test;

import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //char ch = '하';
        String str = scanner.next();
        char ch = str.charAt(0);
        //System.out.println((int)ch); //A - 65
        for (char i = ch; i >= 'a'; i--) {
            for(char j='a';j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }
}

package test;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Test08 {
    public static void main(String[] args) {
        //1. StringTokenizer
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String str = scanner.nextLine();
            if(str.equals("그만") || str.equals("exit")) break;
            //1. StringTokenizer로 구현
            //StringTokenizer stringTokenizer = new StringTokenizer(str," ");
            //int count = stringTokenizer.countTokens();

            //2. split으로 구현
            //String words [] = str.split(" ");
            //int count = words.length;

            //3. WordCounter 인터페이스로 구현
            WordCounter wordCounter = new SplitWordCounter();
            int count = wordCounter.countWord(str);
            System.out.println(str+"은 "+count+"개의 단어로 이루어져 있습니다.");
        }
    }
}

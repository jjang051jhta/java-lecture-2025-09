package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        /*
        2. Scanner 클래스를 사용하여 6개 학점('A', 'B', 'C', 'D', 'F')을
        문자로 입력받아 ArrayList에 저장하고, ArrayList를 검색하여
        학점을 점수(A=4.0, B=3.0, C=2.0, D=1.0, F=0)로 변환하여
        평균을 출력하는 프로그램을 작성하라.
         */
        Scanner scanner = new Scanner(System.in);
        List<Character> scores =  new ArrayList<>();
        for(int i=0;i<6;i++) {
            String str = scanner.next();
            char ch = str.charAt(0);
            scores.add(ch);
        }
        double sum = 0;
        Iterator<Character> iterator = scores.iterator();
        while(iterator.hasNext()) {
            char ch =  iterator.next();
            double score = switch (ch) {
                case 'A'->4.0;
                case 'B'->3.0;
                case 'C'->2.0;
                case 'D'->1.0;
                default -> 0.0;
            };
            sum+=score;
        }
        System.out.println("평균은 "+sum/6);
    }
}

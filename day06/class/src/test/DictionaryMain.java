package test;

import java.util.Scanner;

public class DictionaryMain {
    public static void main(String[] args) {
        //Dictionary dictionary = new Dictionary();
        Scanner scanner = new Scanner(System.in);
        System.out.println("한영사전입니다.");
        while (true) {
            System.out.println("검색할 한글 단어를 입력하세요.");
            String kor = scanner.next();
            if(kor.equals("끝") ||kor.equals("그만")) {
                System.out.println("종료합니다.");
                return;
            }
            String eng = Dictionary.kor2Eng(kor);
            if(eng==null) {
                System.out.println("없는 단어입니다.");
            } else {
                System.out.println(kor+"은 영어로 "+eng+" 입니다.");
            }
        }
    }
}

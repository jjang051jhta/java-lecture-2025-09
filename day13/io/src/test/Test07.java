package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test07 {
    public static void main(String[] args) {
//        words.txt 파일에는 한 라인에 하나의 영어 단어가 들어 있다.
//                이 파일을 한 라인씩 읽어 List<String>에 라인별로 삽입하여 저장하고,
//                영어 단어를 입력받아 그 단어로 시작하는 모든 단어를 list에서 찾아 출력하는
//        프로그램을 작성하라.
        List<String> words =  new ArrayList<>();
        FileReader fileReader = null;
        try {
            fileReader = new FileReader("temp/words.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String word = null;
            while((word = bufferedReader.readLine())!=null) {
                words.add(word);
            }
            //System.out.println(words);
            Scanner scanner = new Scanner(System.in);
            while(true) {
                System.out.println("찾을 단어를 입력하세요.");
                String search = scanner.nextLine();
                if(search.equals("exit")) break;
                boolean isSearched = false;
                for(int i=0;i<words.size();i++) {
                    String str = words.get(i);
                    if(str.startsWith(search)) {
                        System.out.println(str); //zo가 들
                        isSearched = true;
                    }
                }
                if(!isSearched) {
                    System.out.println("찾는 단어가 없습니다.");
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

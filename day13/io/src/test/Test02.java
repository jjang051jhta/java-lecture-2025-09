package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("temp/phone.txt");
            System.out.println("전화번호를 출력합니다.");
            while (true) {
                int c = fileReader.read(); //한글자씩 읽기
                if(c==-1) break;
                System.out.print((char)c);
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("파일이 없습니다.");
        } catch (IOException e) {
            System.out.println("출력할 수 없습니다.");
        }
    }
}

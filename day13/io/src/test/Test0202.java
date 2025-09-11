package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test0202 {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("temp/phone.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader,1024*8); //8kb
            System.out.println("전화번호를 출력합니다.");
            /*
            while (true) {
                int c = bufferedReader.read(); //한글자씩 읽기
                if(c==-1) break;
                System.out.print((char)c);
            }
             */
            //고속처리 할때는 BufferedReader() / BufferedWriter()
            while (true) {
                String string = bufferedReader.readLine(); //한글자씩 읽기
                if(string==null) break;
                System.out.println(string);
            }

            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("파일이 없습니다.");
        } catch (IOException e) {
            System.out.println("출력할 수 없습니다.");
        }
    }
}

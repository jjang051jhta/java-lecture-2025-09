package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test03 {
    public static void main(String[] args) {
        //3. c:\windows\system.ini 파일을 읽어 소문자 모두를 대문자로 바꾸어 출력하라.
        //반드시 ini파일을 복사해서 temp파일에 붙여넣고 써라
        try {
            FileReader fileReader = new FileReader("temp/system.ini");
            int c = 0;
            while (true) {
                c = fileReader.read();
                char ch = (char) c;
                if(Character.isLowerCase(ch)) {
                    ch = Character.toUpperCase(ch);
                }
                System.out.print(ch);
                if(c==-1) break;
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

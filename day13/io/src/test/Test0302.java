package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test0302 {
    public static void main(String[] args) {
        //3. c:\windows\system.ini 파일을 읽어 소문자 모두를 대문자로 바꾸어 출력하라.
        //반드시 ini파일을 복사해서 temp파일에 붙여넣고 써라
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("temp/system.ini")))  {
            String line = null;
            while (true) {
                line = bufferedReader.readLine();
                if(line==null) break;
                System.out.println(line.toUpperCase());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

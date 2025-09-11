package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test04 {
    public static void main(String[] args) {
        //4. c:\windows\system.ini 파일에 라인 번호를 붙여 출력하라.
        //반드시 ini파일을 복사해서 temp파일에 붙여넣고 써라
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("temp/system.ini")))  {
            String line = null;
            int num = 0;
            while (true) {
                line = bufferedReader.readLine();
                if(line==null) break;
                num++;
                System.out.println(num+" : "+line.toUpperCase());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

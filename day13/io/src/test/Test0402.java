package test;

import java.io.*;
import java.util.Scanner;

public class Test0402 {
    public static void main(String[] args) {
        //4. c:\windows\system.ini 파일에 라인 번호를 붙여 출력하라.
        //반드시 ini파일을 복사해서 temp파일에 붙여넣고 써라
        Scanner scanner = null;
        try {
            FileReader fileReader = new FileReader("temp/system.ini");
            scanner = new Scanner(fileReader);
            //scanner = new Scanner(new File("temp/system.ini"));
            int num = 0;
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                num++;
                System.out.println(num + " : "+line.toUpperCase());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

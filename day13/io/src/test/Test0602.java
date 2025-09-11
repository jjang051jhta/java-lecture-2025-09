package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test0602 {
    public static void main(String[] args) {
        //6. 전화번호를 미리 c:\temp\phone.txt 파일에 여러 개 저장해둔다.
        //이 파일을 읽어 다음 실행 예시와 같이 동작하는 검색 프로그램을 작성하라.
        Map<String,String > phoneMap = new HashMap<>();
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("temp/phone.txt"))) {
            //bufferReader로 바꿔서 readLine()을 해서 바꿔 보세요.
            String line;
            while((line = bufferedReader.readLine())!=null) {
                line = line.trim();
                if(line.isEmpty()) continue;
                String  parts [] = line.split("\\s+");
                System.out.println(Arrays.toString(parts));
                String key = parts[0];
                String value = parts[1];
                phoneMap.put(key,value);
            }
            System.out.println(phoneMap.size()+"개의 전화번호가 있습니다. 이름을 입력하면 전화번호를 알려드립니다.");
            Scanner inputScanner = new Scanner(System.in);
            while (true) {
                System.out.print("이름 : " );
                String name = inputScanner.next();
                if(name.equals("그만")) break;
                String tel = phoneMap.get(name);
                if(tel==null) System.out.println("없는 사람입니다.");
                else System.out.println(tel);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



    }
}

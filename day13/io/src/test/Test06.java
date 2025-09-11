package test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        //6. 전화번호를 미리 c:\temp\phone.txt 파일에 여러 개 저장해둔다.
        //이 파일을 읽어 다음 실행 예시와 같이 동작하는 검색 프로그램을 작성하라.
        Map<String,String > phoneMap = new HashMap<>();
        try {
            FileReader fileReader = new FileReader("temp/phone.txt");
            Scanner scanner = new Scanner(fileReader);
            //bufferReader로 바꿔서 readLine()을 해서 바꿔 보세요.
            while (scanner.hasNext()) {
                String key = scanner.next();
                String value = scanner.next();
                phoneMap.put(key,value);
            }
            scanner.close();
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
        }
    }
}

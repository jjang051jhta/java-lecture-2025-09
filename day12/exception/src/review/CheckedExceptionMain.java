package review;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionMain {
    public static void main(String[] args) {
        //checked exception
        // 사용자가 핸들링을 해야한다.
        try {
            new BufferedReader(new FileReader("test.txt"));
        } catch (FileNotFoundException e) {
            System.out.println("파일 처리 중 예외 발생");
            System.out.println(e.getMessage());
            e.printStackTrace();
            //throw new RuntimeException(e);
        } finally {
            System.out.println("여기있는 구문은 무조건 실행됩니다.");
        }
    }
}

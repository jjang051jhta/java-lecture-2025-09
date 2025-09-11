package ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamStartMain02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("temp/hello.dat");
        fileOutputStream.write(65);
        fileOutputStream.write(66);
        fileOutputStream.write(67);
        //저장될때는 65 66 67 ascii 문자로 바꿔서 저장
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("temp/hello.dat");
        int data;
        while ((data=fileInputStream.read()) !=-1) {
            System.out.println(data);
        }
        fileInputStream.close();
    }

}

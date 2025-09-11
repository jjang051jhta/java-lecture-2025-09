package ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class StreamStartMain03 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("temp/hello.dat");
        byte input [] = {65,66,67};
        fileOutputStream.write(input);
        //저장될때는 65 66 67 ascii 문자로 바꿔서 저장
        fileOutputStream.close();

        //버퍼링
        FileInputStream fileInputStream = new FileInputStream("temp/hello.dat");
        byte buffer [] = new byte[10];
        //int readCount =  fileInputStream.read(buffer,0,10);
        int readCount =  fileInputStream.read(buffer);
        System.out.println("readCount = "+readCount);
        System.out.println(Arrays.toString(buffer));
        fileInputStream.close();
    }

}

package ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class StreamStartMain04 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("temp/hello.dat");
        byte input [] = {65,66,67};
        fileOutputStream.write(input);
        //저장될때는 65 66 67 ascii 문자로 바꿔서 저장
        fileOutputStream.close();

        //버퍼링
        FileInputStream fileInputStream = new FileInputStream("temp/hello.dat");
        byte readBytes [] = fileInputStream.readAllBytes(); //읽어와야 하는 파일이 작을때  1g
        System.out.println(Arrays.toString(readBytes));
        fileInputStream.close();
        //자바의 입출략 단위는 byte
    }

}

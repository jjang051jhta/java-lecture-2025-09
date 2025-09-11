package ex01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamStartMain {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("temp/hello.dat");
        fileOutputStream.write(65);
        fileOutputStream.write(66);
        fileOutputStream.write(67);
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("temp/hello.dat");
        System.out.println(fileInputStream.read());
        System.out.println(fileInputStream.read());
        System.out.println(fileInputStream.read());
        System.out.println(fileInputStream.read()); //-1은 문서의 끝  eof
        fileInputStream.close();
    }

}

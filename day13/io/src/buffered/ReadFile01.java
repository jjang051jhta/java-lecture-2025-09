package buffered;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static buffered.BufferedConst.*;
public class ReadFile01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
        long startTime = System.currentTimeMillis();
        int data =  0;
        int fileSize = 0;
        while((data=fileInputStream.read()) != -1) {
            fileSize++;
        }
        fileInputStream.close();

        long endTime =  System.currentTimeMillis();
        System.out.println("File Created : "+FILE_NAME);
        System.out.println("File Size : " + fileSize / 1024 / 1024 +"MB");
        System.out.println("elapsed time : "+(endTime - startTime)+"ms");
    }
}

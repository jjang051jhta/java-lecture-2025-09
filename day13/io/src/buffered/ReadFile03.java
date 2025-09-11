package buffered;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

import static buffered.BufferedConst.BUFFER_SIZE;
import static buffered.BufferedConst.FILE_NAME;

public class ReadFile03 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream,BUFFER_SIZE);
        long startTime = System.currentTimeMillis();
        int fileSize=0;
        int data = 0;
        while((data=bufferedInputStream.read()) != -1) {
            fileSize++;
        }
        fileInputStream.close();

        long endTime =  System.currentTimeMillis();
        System.out.println("File Created : "+FILE_NAME);
        System.out.println("File Size : " + fileSize / 1024 / 1024 +"MB");
        System.out.println("elapsed time : "+(endTime - startTime)+"ms");
    }
}

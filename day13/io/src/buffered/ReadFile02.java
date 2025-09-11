package buffered;

import java.io.FileInputStream;
import java.io.IOException;

import static buffered.BufferedConst.BUFFER_SIZE;
import static buffered.BufferedConst.FILE_NAME;

public class ReadFile02 {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
        long startTime = System.currentTimeMillis();
        byte buffer [] =  new byte[BUFFER_SIZE];
        int size =  0;
        int fileSize = 0;
        while((size=fileInputStream.read(buffer)) != -1) {
            fileSize+=size;
        }
        fileInputStream.close();

        long endTime =  System.currentTimeMillis();
        System.out.println("File Created : "+FILE_NAME);
        System.out.println("File Size : " + fileSize / 1024 / 1024 +"MB");
        System.out.println("elapsed time : "+(endTime - startTime)+"ms");
    }
}

package buffered;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import static buffered.BufferedConst.*;

public class CreateFile03 {
    public static void main(String[] args) throws IOException {
        //FileOutputStream fileOutputStream = new FileOutputStream(BufferedConst.FILE_NAME);
        FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream,BUFFER_SIZE);
        long startTime = System.currentTimeMillis();
        for(int i=0;i<FILE_SIZE;i++) {
            bufferedOutputStream.write(1);
        }
        bufferedOutputStream.close();
        long endTime =  System.currentTimeMillis();
        System.out.println("File Created : "+FILE_NAME);
        System.out.println("File Size : "+(FILE_SIZE/1024/1204)+"MB");
        System.out.println("elapsed time : "+(endTime - startTime)+"ms");
    }
}

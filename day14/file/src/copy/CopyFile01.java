package copy;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile01 {
    private static final int FILE_SIZE = 1024*1024*200;
    public static void main(String[] args) throws IOException {
        String fileName = "temp/copy.dat";
        long startTime =System.currentTimeMillis();
        FileOutputStream fileOutputStream = new FileOutputStream(fileName);
        byte [] buffer = new byte[FILE_SIZE];
        fileOutputStream.write(buffer);
        fileOutputStream.close();
        long endTime = System.currentTimeMillis();
        System.out.println("File Created : "+fileName);
        System.out.println("File Size : "+FILE_SIZE / 1024/1024+"MB");
        System.out.println("Elapsed Time : "+(endTime - startTime)+"ms");
    }
}

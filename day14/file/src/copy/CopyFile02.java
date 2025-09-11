package copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile02 {
    private static final int FILE_SIZE = 1024*1024*200;
    public static void main(String[] args) throws IOException {
        String fileName = "temp/copy.dat";
        long startTime =System.currentTimeMillis();
        FileInputStream fileIputStream = new FileInputStream(fileName);
        FileOutputStream fileOutputStream = new FileOutputStream("temp/copy_new.dat");
        //byte [] buffer = new byte[FILE_SIZE];
        byte [] bytes =  fileIputStream.readAllBytes();
        fileOutputStream.write(bytes);
        fileIputStream.close();
        fileOutputStream.close();
        long endTime = System.currentTimeMillis();
        System.out.println("Elapsed Time : "+(endTime - startTime)+"ms");
    }
}

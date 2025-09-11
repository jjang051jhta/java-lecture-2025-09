package copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFile03 {
    private static final int FILE_SIZE = 1024*1024*200;
    public static void main(String[] args) throws IOException {
        String fileName = "temp/copy.dat";
        long startTime =System.currentTimeMillis();
        FileInputStream fileIputStream = new FileInputStream(fileName);
        FileOutputStream fileOutputStream = new FileOutputStream("temp/copy_new.dat");
        fileIputStream.transferTo(fileOutputStream); //통째 옮기기 자바 자체적으로 최적화가 되어 있다.
        fileIputStream.close();
        fileOutputStream.close();
        long endTime = System.currentTimeMillis();
        System.out.println("Elapsed Time : "+(endTime - startTime)+"ms");
    }
}

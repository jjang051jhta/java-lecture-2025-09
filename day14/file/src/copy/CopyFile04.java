package copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class CopyFile04 {
    private static final int FILE_SIZE = 1024*1024*200;
    public static void main(String[] args) throws IOException {
        String fileName = "temp/copy.dat";
        long startTime =System.currentTimeMillis();
        Path source =  Path.of("temp/copy.dat");
        Path target =  Path.of("temp/copy_new.dat");
        Files.copy(source,target, StandardCopyOption.REPLACE_EXISTING); //복사 붙여넣기...
        //자바를 거치지 않는다. copy.dat - copy_new.dat
        // 원래는 copy.dat - java  - copy_new.dat 시스탬을 거치는데
        long endTime = System.currentTimeMillis();
        System.out.println("Elapsed Time : "+(endTime - startTime)+"ms");
        //temp/copy.dat을 복사되는 날짜형식으로 파일이름을 바꾸어서 저장
        //temp/copy_20250911113940123.dat
        //
    }
}

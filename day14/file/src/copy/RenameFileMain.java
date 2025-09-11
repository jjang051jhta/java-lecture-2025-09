package copy;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

public class RenameFileMain {
    public static void main(String[] args) throws IOException {
        Path file = Path.of("temp/copy_new.dat");
        if(Files.exists(file)) {
            String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS"));
            UUID uuid = UUID.randomUUID();
            System.out.println(date);

            String fileName  = file.getFileName().toString();
            System.out.println(fileName);
            int dotIdx = fileName.lastIndexOf(".");
            System.out.println(dotIdx);
            String name = fileName.substring(0,dotIdx);
            String extention = fileName.substring(dotIdx+1);
            if(!(extention.equals("jpg") || extention.equals("gif") || extention.equals("png") ||extention.equals("dat") )) {
                System.out.println("이미지 파일만 쓸 수 있습니다.");
                //return;
            }
            System.out.println(name+"==="+extention);
            String newFileName = name+"_"+date+"."+extention;
            Path newFile = file.getParent().resolve(newFileName); //temp/copy_new_20250911121645345.dat
            Files.move(file,newFile, StandardCopyOption.REPLACE_EXISTING);
            //확장가가 jpg,jpeg,png,gif가 아니면 이미지 파일만 쓸 수 있습니다.
            System.out.println("이름 변경 완료");

        }
    }
}

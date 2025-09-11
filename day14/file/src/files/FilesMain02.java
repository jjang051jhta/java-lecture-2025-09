package files;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Stream;

public class FilesMain02 {
    public static void main(String[] args) throws IOException {
        //Files / Path
        Path file = Path.of("temp/example.txt"); //경로 가져오기...
        //폴더()랑 파일로 이루어져 있다
        Path directory = Path.of("temp/exampleDir");
        //Files.delete(file); //삭제
        Files.deleteIfExists(file); //있으면 삭제해라.
        Files.createFile(file);
        System.out.println("File exists : "+Files.exists(file));
        System.out.println("================");
        //Files.deleteIfExists(directory);
        try {
            Files.createDirectory(directory);
        } catch (FileAlreadyExistsException e){
            System.out.println("디렉토리가 존재합니다.");
        }
        System.out.println("is regular file : "+Files.isRegularFile(file));
        System.out.println("is directory : "+Files.isDirectory(directory));
        System.out.println("==============");
        System.out.println("File Name : "+file.getFileName());
        System.out.println("File size : "+Files.size(file)+" bytes");
        System.out.println("==============");
        Path newFile = Paths.get("temp/newExample.txt");
        Files.move(file,newFile, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("File move / renamed");
        //client가 server로 파일을 업로드하면 이름바꿔서 저장해야 한다. a:profile-20250911101124111.png b:profile.png
        System.out.println("Last modified : "+Files.getLastModifiedTime(newFile));
        FileTime fileTime = Files.getLastModifiedTime(newFile);
        Instant instant = fileTime.toInstant();
        ZonedDateTime localTime = instant.atZone(ZoneId.systemDefault());
        System.out.println("현지 시간으로 바꾸기 : "+localTime);
        //메서드체이닝
        ZonedDateTime localTime02 =  Files.getLastModifiedTime(newFile)
                                          .toInstant()
                                          .atZone(ZoneId.systemDefault());
        String formatTime =  localTime02.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        System.out.println("현지 시간으로 바꾸기 : "+localTime02);
        System.out.println("현지 시간으로 바꾸기 : "+formatTime);
        System.out.println("======================");
        BasicFileAttributes basicFileAttributes =  Files.readAttributes(newFile,BasicFileAttributes.class);
        System.out.println("Create Time : "+basicFileAttributes.creationTime());
        System.out.println("is directory : "+basicFileAttributes.isDirectory());
        System.out.println("is regular file : "+basicFileAttributes.isRegularFile()); //파일인지 아닌지...
        System.out.println("file size : "+basicFileAttributes.size());
        //temp폴더에 sample.txt파일을 하나 만들기... 없으면 만들고 있으면 안만들기....
        Path tempDir = Paths.get("temp");
        //Path filePath = Paths.get("temp/sample.txt");
        Path filePath = tempDir.resolve("sample.txt"); //temp/sample.txt
        Files.deleteIfExists(filePath);

        if(Files.notExists(tempDir)) {
            Files.createDirectory(tempDir);
        }
        if(Files.notExists(filePath)) {
            Files.createFile(filePath);
        }
        System.out.println("====================");
        Path path =  Path.of("temp/..");
        System.out.println("path : "+path);
        System.out.println("Absolute Path : "+path.toAbsolutePath()); //이건 진짜로 단순 문자열
        System.out.println("Canonical Path : "+path.toRealPath()); //우리가 친근한 path
        Stream<Path> pathStream = Files.list(path);
        List<Path> pathList = pathStream.toList();
        pathStream.close();
        for(Path p : pathList) {
            System.out.println(Files.isRegularFile(p) ? "F":"D"+"   "+p.getFileName());
        }
        //Reader Writer
    }
}










package old;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FileMain {
    public static void main(String[] args) throws IOException {
        File file = new File("temp/example.txt");     //파일을 가리킨다.
        File directory = new File("temp/exampleDir"); //폴더를 가리킨다.
        System.out.println("File exist : "+file.exists());
        //Files, Paths
        //2.파일을 만들어보자
        boolean created = file.createNewFile();
        System.out.println("file created : "+created);
        System.out.println("================");
        System.out.println("File exist : "+file.exists());

        System.out.println("================");
        boolean dirCreated = directory.mkdir();
        System.out.println("directory created : "+dirCreated);

        System.out.println("=================");
        //boolean fileDelete = file.delete();
        //System.out.println("File deleted : "+fileDelete);

        System.out.println("is file : "+file.isFile());
        System.out.println("is file : "+directory.isFile());

        System.out.println("is directory : "+file.isDirectory());
        System.out.println("is directory : "+directory.isDirectory());

        System.out.println(file.getName());
        File renameFile =  new File("temp/renameExample.txt");
        boolean renameTo = file.renameTo(renameFile);
        //profile.png  j84983r89ewjrewrljewlrkjewr099euwrkewuroie.png
        //profil20250910163510e.png
        System.out.println(renameTo);

        long lastModified = renameFile.lastModified();
        System.out.println("lastModified : "+lastModified);
        //System.out.println(new Date(lastModified));
        Instant instant  = Instant.ofEpochMilli(lastModified);
        //ZonedDateTime zonedDateTime = instant.atZone(ZoneId.of("Asia/Seoul"));
        ZonedDateTime zonedDateTime = instant.atZone(ZoneId.systemDefault());
        System.out.println(zonedDateTime);
        String formatTime =  zonedDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(formatTime);

        File path = new File("temp/../src");

        System.out.println("file.getPath()==="+path.getPath());
        System.out.println("file.getAbsolutePath()==="+path.getAbsolutePath());     //있는 그대로 찍기
        System.out.println("file.getCanonicalPath()==="+path.getCanonicalPath());   //우리가 알고 있는 path
        //LocalDdateTime //Instant //Du
        File [] files = path.listFiles();
        for(File f:files) {
            if(f.isFile()) {
                System.out.println(f);
            }
        }
        //File 가지고 Path쓰고 File 둘다 썼다.
        //nio Files,Path
    }
}

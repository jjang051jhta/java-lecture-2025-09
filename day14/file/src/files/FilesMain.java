package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesMain {
    public static void main(String[] args) {
        //Files  파일을 다루는 유틸리티 static Files.
        //util계열은 static을 주로 쓴다.
        Path file = Path.of("temp/example02.txt");
        Path directory = Path.of("temp/exampleDir");
        Path fakeDirectory = Path.of("temp/exampleDirfdfdsfd");
        System.out.println("Files.exists(file)==="+Files.exists(file));
        System.out.println("Files.exists(directory)==="+Files.exists(directory));
        System.out.println("Files.exists(fakeDirectory)==="+Files.exists(fakeDirectory));

        try {
            Files.createFile(file);
            System.out.println("file created");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

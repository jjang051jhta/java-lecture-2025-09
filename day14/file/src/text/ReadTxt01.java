package text;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadTxt01 {
    public static void main(String[] args) throws IOException {
        String str = "abc\n가나다";
        System.out.println(str);
        Path path  = Path.of("temp/hello.txt");
        Files.writeString(path,str, StandardCharsets.UTF_8);
        System.out.println("===============");
        String readStr =  Files.readString(path,StandardCharsets.UTF_8);
        System.out.println(readStr);

    }
}

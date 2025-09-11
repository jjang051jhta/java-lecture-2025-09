package text;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadTxt02 {
    public static void main(String[] args) throws IOException {
        String str = "abc\n가나다";
        System.out.println(str);
        Path path  = Path.of("temp/hello.txt");
        Files.writeString(path,str, StandardCharsets.UTF_8);
        System.out.println("===============");
        List<String> lines = Files.readAllLines(path,StandardCharsets.UTF_8); //싹 읽어서 한줄씩 list에 담기
        //Files.lines(path);  한줄씩 읽어서 Stream으로 반환  용랴잉 크다면 이걸 사용
        for(int i=0;i<lines.size();i++) {
            System.out.println((i+1)+" : "+lines.get(i));
        }

    }
}

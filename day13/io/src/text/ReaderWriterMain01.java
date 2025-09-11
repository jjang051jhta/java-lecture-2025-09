package text;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import static text.TextConst.*;
public class ReaderWriterMain01 {
    public static void main(String[] args) throws IOException {
        //Reader는 읽기
        //Writer는 쓰기
        String writeStr = "ABC";
        byte [] writeBytes = writeStr.getBytes(StandardCharsets.UTF_8);
        System.out.println("write String : "+writeStr);
        System.out.println("write bytes : "+ Arrays.toString(writeBytes));

        //byte
        FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
        fileOutputStream.write(writeBytes);
        fileOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
        byte [] readBytes = fileInputStream.readAllBytes();
        fileInputStream.close();
        String readString = new String(readBytes,StandardCharsets.UTF_8);
        System.out.println("read bytes : "+Arrays.toString(readBytes));
        System.out.println("read string : "+readString);
        //중요 정보는 db 영속화할 필요가 있는 data는  db에 담고  그렇지 않은 휘발성 data는 문서에 담기도 한다.
        // 요즘은 대부분(redis key value 메모리 db)를 사용한다.
    }
}

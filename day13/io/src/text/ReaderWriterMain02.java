package text;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import static text.TextConst.FILE_NAME;

public class ReaderWriterMain02 {
    public static void main(String[] args) throws IOException {
        //Reader는 읽기
        //Writer는 쓰기
        String writeStr = "ABC";
        byte [] writeBytes = writeStr.getBytes(StandardCharsets.UTF_8);
        System.out.println("write String : "+writeStr);

        FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream, StandardCharsets.UTF_8);
        outputStreamWriter.write(writeStr);
        outputStreamWriter.close();

        FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,StandardCharsets.UTF_8);
        int ch=0;
        StringBuilder stringBuilder = new StringBuilder();
        while ((ch=inputStreamReader.read())!=-1) {
            stringBuilder.append((char)ch);
        }
        inputStreamReader.close();
        System.out.println("read string : "+stringBuilder);
        //중요 정보는 db 영속화할 필요가 있는 data는  db에 담고  그렇지 않은 휘발성 data는 문서에 담기도 한다.
        // 요즘은 대부분(redis key value 메모리 db)를 사용한다.
    }
}

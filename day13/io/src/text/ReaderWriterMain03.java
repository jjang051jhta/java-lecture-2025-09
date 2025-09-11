package text;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static text.TextConst.FILE_NAME;

public class ReaderWriterMain03 {
    public static void main(String[] args) throws IOException {
        //Reader는 읽기
        //Writer는 쓰기
        String writeStr = "ABC";
        System.out.println("write String : "+writeStr);
        FileWriter fileWriter = new FileWriter(FILE_NAME,StandardCharsets.UTF_8);
        fileWriter.write(writeStr);
        fileWriter.close();

        FileReader fileReader = new FileReader(FILE_NAME,StandardCharsets.UTF_8);
        StringBuilder stringBuilder = new StringBuilder();
        int ch =0;
        while((ch=fileReader.read())!=-1) {
            stringBuilder.append((char) ch);
        }
        fileReader.close();
        System.out.println("read string : "+stringBuilder);


        //bufferedReader

    }
}

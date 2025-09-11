package text;

import org.w3c.dom.Text;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static text.TextConst.FILE_NAME;

public class ReaderWriterMain04 {
    private static final int BUFFER_SIZE = 8*1024;
    public static void main(String[] args) throws IOException {
        //Reader는 읽기
        //Writer는 쓰기

        String writeStr = "ABC\n가나다";
        System.out.println("write String : "+writeStr);

        FileWriter fileWriter = new FileWriter(FILE_NAME,StandardCharsets.UTF_8);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter,BUFFER_SIZE);
        bufferedWriter.write(writeStr);
        bufferedWriter.close();


        FileReader fileReader = new FileReader(FILE_NAME,StandardCharsets.UTF_8);
        BufferedReader bufferedReader = new BufferedReader(fileReader,BUFFER_SIZE);
        StringBuilder stringBuilder = new StringBuilder();
        String line;
        while ((line=bufferedReader.readLine())!=null) {
            stringBuilder.append(line).append("\n");
        }
        bufferedReader.close();
        System.out.println("read string : "+stringBuilder);
        //bufferedReader
    }
}

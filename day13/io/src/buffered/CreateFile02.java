package buffered;

import java.io.FileOutputStream;
import java.io.IOException;

import static buffered.BufferedConst.*;

public class CreateFile02 {
    public static void main(String[] args) throws IOException {
        //FileOutputStream fileOutputStream = new FileOutputStream(BufferedConst.FILE_NAME);
        FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
        byte bufffer [] = new byte[BUFFER_SIZE];
        long startTime = System.currentTimeMillis();
        int bufferIndex = 0;
        //버퍼를 이용하면 훨씬 빠르게 입출력을 할 수 있다.
        for(int i=0;i<FILE_SIZE;i++) {
            //fileOutputStream.write(1);
            bufffer[bufferIndex] = 1;
            bufferIndex++;
            if(bufferIndex==BUFFER_SIZE) {
                fileOutputStream.write(bufffer);
                bufferIndex=0;
            }
        }
        //남아 있는 거 강제로 밀어넣기
        if(bufferIndex>0) {
            fileOutputStream.write(bufffer,0,bufferIndex);
        }
        fileOutputStream.close();

        long endTime =  System.currentTimeMillis();
        System.out.println("File Created : "+FILE_NAME);
        System.out.println("File Size : "+(FILE_SIZE/1024/1204)+"MB");
        System.out.println("elapsed time : "+(endTime - startTime)+"ms");
    }
}

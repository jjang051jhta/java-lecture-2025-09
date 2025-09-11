package test;

import java.io.*;

public class Test05 {
    public static void main(String[] args) {
        //5. 파일 복사 연습을 해보자.
        //이미지 복사가 진행되는 동안 10% 진행할 때마다 '*'을 하나씩 출력하도록 하라.
        //아래 실행 예시에서는 프로젝트 폴더 밑에 a.jpg을 미리 준비해 두었다.
        try {
            //외부 글자가 아닌 파일들은 FileInputStream으로 읽으면 된다.
            File file = new File("temp/img.png");
            long fileSize = file.length();
            long tenPercent =  fileSize/100;
            long progress =  0;
            //System.out.println("파일크기 : "+file.length()/1024);
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileoutputStream = new FileOutputStream("temp/copy.png");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream,1);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileoutputStream,1);
            byte [] bytes = new byte[1];
            int num =0;
            while(true) {
                num = bufferedInputStream.read(bytes);
                if(num==-1) {
                    if(progress>0){
                        System.out.print("* ");
                    }
                    break;
                }

                //System.out.println(num);
                bufferedOutputStream.write(bytes);
                progress+=num;
                if(progress>=tenPercent) {
                    System.out.print("* ");
                    progress = 0;
                }
            }
            bufferedInputStream.close();
            bufferedOutputStream.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

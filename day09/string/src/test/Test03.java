package test;

import java.util.Arrays;
import java.util.StringTokenizer;

public class Test03 {
    public static void main(String[] args) {
        //3."hello.txt"에서 확장자와 파일명을 각각 출력하는 코드를 작성하시오.
        String file =  "hello.txt";

        int dotIdx =  file.lastIndexOf(".");
        System.out.println(dotIdx);
        String fileName = file.substring(0,dotIdx);
        String extentionName = file.substring(dotIdx+1);
        System.out.println(fileName);
        System.out.println(extentionName);
        System.out.println("====================");
        String strArray [] = file.split("\\.");
        System.out.println(Arrays.toString(strArray));
        String fileName02 = strArray[0];
        String extentionName02 = strArray[1];
        System.out.println(fileName02);
        System.out.println(extentionName02);
        System.out.println("====================");
        StringTokenizer stringTokenizer = new StringTokenizer(file,".");
        while (stringTokenizer.hasMoreTokens()) {
            System.out.println(stringTokenizer.nextToken());
        }
        String temp =  "a*b*c*d";
        String strArray02 [] = temp.split("\\*");
        //일반 String이 들어가도 되는데 만약 정규표현식에서 가져다 쓰는 특수문자일경우 escape문자처리해야함
        System.out.println(Arrays.toString(strArray02));
    }
}

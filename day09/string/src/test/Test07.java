package test;

import java.util.Arrays;

public class Test07 {
    public static void main(String[] args) {
        //7.  String str = "start hello java, hello spring, hello jpa";
        //String key = "hello";
        //주어진 문자열 str에서 key가 몇번 등장하는지 확인하는 코드를 작서하시오.
        String str = "start hello java, hello spring, hello jpa";
        String key = "hello";
        String strArray[] = str.split(key);
        System.out.println(Arrays.toString(strArray));
        System.out.println(strArray.length-1);
        System.out.println("================");
        int count = 0;
        int idx = 0;
       System.out.println(str.indexOf(key));
        while((idx = str.indexOf(key,idx))!=-1) {
            count++;
            idx +=key.length();
        }
        System.out.println("count==="+count);
    }
}

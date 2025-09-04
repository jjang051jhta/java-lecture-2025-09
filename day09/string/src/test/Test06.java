package test;

import java.text.DecimalFormat;

public class Test06 {
    public static void main(String[] args) {
        //정수 문자열에 천 단위 콤마를 삽입하시오. ex) 1234567890
        //20250901    2025 09 01 //Formatter
        String strNum =  "162767676";
        StringBuilder stringBuilder = new StringBuilder(strNum);
        System.out.println(stringBuilder);
        int len = strNum.length();
        for(int i=len-3;i>0;i-=3) {
            stringBuilder.insert(i,",");
        }
        System.out.println(stringBuilder);
        //숫자에 쓰는거...
        int num = Integer.parseInt(strNum);
        DecimalFormat decimalFormat = new DecimalFormat("###,###");
        String formatted = decimalFormat.format(num);
        System.out.println(formatted);
    }
}

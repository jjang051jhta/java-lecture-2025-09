package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        /*
        3."그만"이 입력될 때까지 나라 이름과 인구를 입력받아 저장하고
        다시 나라 이름을 입력받아 인구를 출력하는 프로그램을 작성하라.
        다음 해시맵을 이용하라.
        한국 50000000
        미국 200000000
        Map
         */
        Map<String, Integer> country = new HashMap<>();
        country.put("한국",500_000_000);
        country.put("미국",2_000_000_000);
        country.put("중국",1_000_000_000);
        country.put("인도",1_200_000_000);
        country.put("일본",1_500_000_000);
        country.put("영국",600_000_000);
        //System.out.println(country.get("한국"));
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String str = scanner.next();
            if(str.equals("그만")) break;
            int population =  country.get(str);
            System.out.println(str+"의 인구 : "+population);
        }
    }
}

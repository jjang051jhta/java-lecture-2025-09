package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Test09 {
    public static void main(String[] args) {
        List<Country> countryList = new ArrayList<>();
        countryList.add(new Country("대한민국","서울"));
        countryList.add(new Country("일본","도쿄"));
        countryList.add(new Country("미국","워싱턴"));
        countryList.add(new Country("호주","캔버라"));
        countryList.add(new Country("캐나다","오타와"));
        System.out.println("수도맞추기 게임을 시작합니다. 나라이름이 나오면 수도이름을 입력하세요");
        Scanner scanner = new Scanner(System.in);
        while(true) {
            Random random = new Random();//0,1,2,3,4
            int num = random.nextInt(countryList.size());
            System.out.println(countryList.get(num).getCountry()+"의 수도는?");
            String capital = countryList.get(num).getCapital();
            String str = scanner.nextLine();
            if(str.equals("그만")) break;
            if(str.equals(capital)) {
                System.out.println("정답");
            } else {
                System.out.println("땡");
            }
        }
    }
}

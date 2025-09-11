package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Test08 {
    public static void main(String[] args) {
        /*
        8. 고객의 이름과 포인트 점수를 관리하는 프로그램을 해시맵을 이용하여 작성하라.
                프로그램은 고객의 이름과 포인트를 함께 저장 관리하는데,
        포인트는 추가될 때마다 누적하여 저장된다.
         */
        Map<String,Custromer> custromerMap = new HashMap<>();
        custromerMap.put("장성호", new Custromer("장성호",100));
        custromerMap.put("장동건", new Custromer("장동건",100));
        custromerMap.put("유재석", new Custromer("유재석",100));
        custromerMap.put("하하", new Custromer("하하",100));
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("이름과 포인트를 입력하시오.");
            String name = scanner.next();
            if(name.equals("그만")) break;
            int point = scanner.nextInt();
            Custromer custromer = custromerMap.get(name);
            int addPoint = custromer.getPoint()+point;
            custromerMap.put(name,new Custromer(name,addPoint));
            showAllCustomer(custromerMap);
        }
    }

    private static void showAllCustomer(Map<String, Custromer> custromerMap) {
        Iterator<String> iterator = custromerMap.keySet().iterator();
        while (iterator.hasNext()) {
            System.out.print(custromerMap.get(iterator.next()));
        }
    }
}

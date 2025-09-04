package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        //4. List 컬렉션을 이용하여 강수량의 평균을 유지 관리하는 프로그램을 작성하라. 강수량을 입력하면 리스트에 추가하고 현재 입력된 모든 강수량과 평균을 출력한다.
        Scanner scanner = new Scanner(System.in);
        List<Integer> waterList = new ArrayList<>();
        int water = 0;
        int sum = 0;
        double avg = 0;
        while (true) {
            int num = scanner.nextInt();
            if (num == -1) break;
            waterList.add(num);
            Iterator<Integer> iterator = waterList.iterator();
            while (iterator.hasNext()) {
                water = iterator.next();
                System.out.print(water+" / ");
            }
            sum+=water;
            avg = sum / waterList.size();
            System.out.println("평균 강수량 : "+avg);
        }
    }
}

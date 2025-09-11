package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        //1. Scanner 클래스로 -1이 입력될 때까지 양의 정수를 입력받아 리스트에 저장하고
        //리스트를 검색하여 가장 큰 수를 출력하는 프로그램을 작성하라.1. Scanner 클래스로 -1이 입력될 때까지 양의 정수를 입력받아 리스트에 저장하고
        //리스트를 검색하여 가장 큰 수를 출력하는 프로그램을 작성하라.
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = new ArrayList<>();
        while(true) {
            int num = scanner.nextInt();
            if(num==-1) break;
            nums.add(num);
        }
        System.out.println(nums);
        Iterator<Integer> iterator = nums.iterator();
        int big = nums.get(0); //1,2,1,5,6,7,8,
        //System.out.println(iterator.next().compareTo(10));
        while (iterator.hasNext()) {
            /*
            if(iterator.next()>big) {
                big = iterator.next();
            }
             */
            //big보다 크면 1 작으면 -1 같으면 0
            if(iterator.next().compareTo(big) > 0) {
                big = iterator.next();
            }
        }
    }
}

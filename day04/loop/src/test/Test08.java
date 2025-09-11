package test;

import java.util.Arrays;

public class Test08 {
    public static void main(String[] args) {
        /*
        8. 정수를 몇 개 저장할 지 키보드로부터 100보다 작은 갯수를 입력받아 정수 배열을 생성하고,
        이곳에 1에서 100까지 범위의 정수를 랜덤하게 삽입하라.
        배열에는 같은 수가 없도록 하여 배열을 출력하라.

        정수 몇 개 ?  24
        48 33 74 94 17 39 55 8 59 81 ...
        (랜덤한 정수가 24개 출력)
         */
        long startTime = System.nanoTime();
        int total = 50;
        int intArray[] =  new int[total];
        //1.int random = (int) (Math.random() * 100) + 1;
        boolean isDuplicate = false;
        for(int i = 0;i<total;i++) {
            int random = (int) (Math.random() * 100) + 1; //23,12,34
            //intArray[i] = random;
            //System.out.print(random+"/");
            for(int j = 0;j<=i;j++) {
                if(random==intArray[j]) {
                    isDuplicate=true;
                    break;
                } else {
                    isDuplicate=false;
                }
            }
            if(isDuplicate) {
                i--;
                continue;
            }
            intArray[i]= random; //[23,12]
        }

        Arrays.sort(intArray);
        long endTime = System.nanoTime();
        System.out.println(endTime-startTime);
        System.out.println(Arrays.toString(intArray));
    }
}

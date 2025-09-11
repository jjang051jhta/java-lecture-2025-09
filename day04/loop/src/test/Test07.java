package test;

import java.util.Arrays;

public class Test07 {
    public static void main(String[] args) {
        //System.out.println((int)(Math.random()*10)+1); //    0*10 < x*10 < 1*10  사이의 실수
        int total = 10;
        int randomArray[] = new int[total];
        int sum=0;
        for (int i = 0; i < total; i++) {
            randomArray[i] = (int) (Math.random() * 10) + 1;
        }
        for(int j=0;j<total;j++) {
            sum+=randomArray[j];
        }
        double avg = (double) sum / total;
        System.out.println(Arrays.toString(randomArray));
        System.out.println("sum = "+sum+" / 평균은 "+avg);
    }
}

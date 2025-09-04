package test;

import java.util.Arrays;

public class Test08_02 {
    public static void main(String[] args) {
        int total = 50;
        int intArray[] =  new int[total];
        boolean usedArray[] =  new boolean[101]; //중복체크용
        //1~100
        //System.out.println(Arrays.toString(usedArray));
        long startTime = System.nanoTime();
        int i=0;
        while(i<total) {
            int random = (int) (Math.random() * 100) + 1; //23,10,23,10,11
            if(usedArray[random]) {
                continue;
            }
            usedArray[random]=true;
            intArray[i] = random;
            //[23,10,23]
            i++;
        }
        long endTime = System.nanoTime();
        System.out.println(endTime-startTime);
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(usedArray));
    }
}

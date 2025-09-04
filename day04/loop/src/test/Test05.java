package test;

import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
//        int intArray[] = new int[10];
//        intArray[0] = 10;
//        intArray[1] = 10;
//        intArray[2] = 10;
//        intArray[3] = 10;
//        intArray[0] = 10;
//        intArray[0] = 10;
        //int intArray[] = {10,23,5,6,8,14,54,90,76,24,25,20};
        int intArray[] = new int[10];
        int total = intArray.length;
        Scanner scanner = new Scanner(System.in);
        for(int j=0;j<total;j++) {
            intArray[j]  = scanner.nextInt();
        }
        //System.out.println(intArray.length);
        for(int i=0;i<total;i++) {
            if(intArray[i]%3==0) {
                System.out.print(intArray[i]+"\t");
            }
        }
    }
}

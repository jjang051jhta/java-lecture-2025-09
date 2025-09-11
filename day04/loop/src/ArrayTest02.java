import java.util.Arrays;

public class ArrayTest02 {
    public static void main(String[] args) {
        int nums[] = {10,20,30,40,50};
        for(int i=0;i<5;i++) {
            System.out.print(nums[i]+"/");
        }
        System.out.println();
        //each for each
        for(int num : nums) {
            System.out.print(num+"/");
        }
        System.out.println();
        String fruits []  = {"사과","복숭아","수박","딸기","바나나"};
        for(int i=0;i<5;i++) {
            System.out.print(fruits[i]+"/");
        }
        System.out.println();
        //each for each
        for(String fruit : fruits) {
            System.out.print(fruit+"/");
        }

        String strArray[][] = new String[4][4];
        strArray[0][0] = "0 0";
        strArray[0][1] = "0 1";
        strArray[0][2] = "0 2";
        strArray[0][3] = "0 3";

        double scores[][] = new double[4][2];
        scores[0][0] =3.5;
        scores[0][1] =3.2;
        scores[1][0] =3.9;
        scores[1][1] =4.2;
        scores[2][0] =4.3;
        scores[2][1] =4.25;
        scores[3][0] =4.22;
        scores[3][1] =4.35;
        System.out.println();
        for(int year=0;year<scores.length;year++) {
            for(int term=0;term<scores[year].length;term++) {
                System.out.println(year+1+"학년 "+(term+1)+"학기의 학점은 "+scores[year][term]+"입니다.");
            }
        }
        int yearNum = 1;
        for(double[] year : scores) {
            System.out.println(Arrays.toString(year));
            int termNum = 1;
            for(double term : year) {
                System.out.println(yearNum+"학년 "+termNum+"학기의 학점은 "+term+"입니다.");
                termNum++;
            }
            yearNum++;
        }
    }
}

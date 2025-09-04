package test;

public class Test01_02 {

    public static void main(String[] args) {
        int sum=0;
        for(int i=0;i<100;i+=2) {
            sum += i;
        }
        System.out.println("0 ~ 100짝수의 합은 "+sum);
    }
}

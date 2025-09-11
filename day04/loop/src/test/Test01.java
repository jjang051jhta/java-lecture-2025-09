package test;

public class Test01 {
    public static void main(String[] args) {
        //100보다 작은 짝수의 합을 구하는 코드를 작성하시오.
        //for문과 while문으로 각각 작성하시오.
        int i = 0;

        int sum = 0;
        //변수 스코프 block
        while (i < 100) {
            sum += i;
            i+=2;
        }
        System.out.println("0 ~ 100짝수의 합은 "+sum);
    }
}

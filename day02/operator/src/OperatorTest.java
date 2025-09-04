public class OperatorTest {
    public static void main(String[] args) {
        int num01 = 20;
        int num02= 3;  //0~2
        /*
        System.out.println("num01 + num02 = "+(num01+num02));
        System.out.println("num01 - num02 = "+(num01-num02));
        System.out.println("num01 * num02 = "+(num01*num02));
        System.out.println("num01 / num02 = "+(num01/num02));
        System.out.println("num01 % num02 = "+(num01%num02));
         */
        System.out.printf("num01 + num02 = %d%n",num01+num02);
        System.out.printf("num01 - num02 = %d%n",num01-num02);
        System.out.printf("num01 * num02 = %d%n",num01*num02);
        System.out.printf("num01 / num02 = %d%n",num01/num02);
        System.out.printf("num01 %% num02 = %d%n",num01%num02);
        //스캐너로 정수를 입력받아서
        //5000s  몇시간 몇분 몇초인지를 출력하시오.

        num01 = num01+1;
        System.out.println(num01);
        num01+=1;
        System.out.println(num01);
        num01++;
        System.out.println(num01); //23
        int num03 = num01++;
        System.out.println(num03);
        System.out.println(num01);
        //num01 = num01-3;
        num01 -= 3;
        System.out.println(num01);
        num01*=2;
        System.out.println(num01);
        num01/=2;
        System.out.println(num01);
        num01%=2;
        System.out.println(num01);
    }
}

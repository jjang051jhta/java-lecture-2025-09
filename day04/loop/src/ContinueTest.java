import java.util.Scanner;

public class ContinueTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;

        //양수의 합만 구해보세요....
        //변수의 scope 변수의 유효범위
        int localVar=10;
        for(int i=1;i<=5;i++) {
            //if(i==5) continue;
            //System.out.print(i+",");
            int num = scanner.nextInt();
            if(num<0) continue;
            sum+=num;
        }
        System.out.println(sum);
    }
}

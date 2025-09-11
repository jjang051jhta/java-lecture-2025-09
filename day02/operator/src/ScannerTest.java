import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next(); //String을 받겠다
        System.out.println("키보드로부터 입력받은 문자열은 "+name);
        //10+10
        int num = scanner.nextInt(); //String을 받겠다
        System.out.println(num+10);
        //연산 operator
        // 프로그래밍을 돌리는 두개 문(statement) 식(expression)


    }
}

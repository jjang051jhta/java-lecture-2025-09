import java.util.Scanner;

public class WhileTest02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하세요. -1을 누르면 종료합니다.");
        int num = scanner.nextInt();
        int count = 0;
        int sum = 0;
        double avg = 0;
        while (num!=-1) {
            count++;
            sum+=num;
            //System.out.println(num);
            num = scanner.nextInt();
        }
        avg =  (double) sum / count;
        System.out.println("종료되었습니다.");
        System.out.println("입력하신 정수의 갯수는 "+count+" 평균은 "+avg+"입니다.");
    }
}

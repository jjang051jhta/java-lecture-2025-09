import java.util.Scanner;

public class TimePrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("초를 입력하시면 시분초로 보여 드립니다.");
        int time = scanner.nextInt();
        int hour = (time / 60) / 60;
        int min = (time / 60) % 60;
        int sec =  time % 60;
        System.out.println("time "+time+"을 시분초로 표시합니다.");
        System.out.println(hour+ "시 "+ min+"분 "+sec+"초");
        scanner.close(); //더 이상 입력은 받지 않겠다.
        scanner = null; // 참조 제거됨... gc의 수거 대상으로 바뀜...
        //305490
        // 5만원권 6장
        // 만원권 0장
        // 5천원권 1장
        // 천원권 0장
        // 5백원 0
        // 100원 4개
        // 5십원 1개
        //십원 4개
    }
}

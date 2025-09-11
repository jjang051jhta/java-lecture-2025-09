import java.util.Scanner;

public class MoneyPrint {
    public static void main(String[] args) {
        System.out.println("금액을 입력하시면 한국은행권으로 바꿔 드립니다.");
        Scanner scanner = new Scanner(System.in);
        int money = scanner.nextInt();
        int rest = 0;
        int money50000 = money / 50000;
        rest = money % 50000;
        int money10000 = rest / 10000;
        rest = money % 10000;
        int money5000 = rest / 5000;
        rest = money % 5000;
        int money1000 = rest / 1000;
        rest = money % 1000;
        int money500 = rest / 500;
        rest = money % 500;
        int money100 = rest / 100;
        rest = money % 100;
        int money50 = rest / 50;
        rest = money % 50;
        int money10 = rest / 10;
        rest = money % 10;
        System.out.println("money " + money + "을 한국은행권으로 표시합니다.");
        System.out.printf("5만원권 %d%n 1만원권 %d%n 5천원권 %d%n 1천원권 %d%n 5백원권 %d%n 1백원권 %d%n 5십원권 %d%n 십원권 %d",
                money50000, money10000, money5000, money1000, money500, money100, money50, money10
        );
        //scanner.close(); //더 이상 입력은 받지 않겠다.
        //scanner = null; // 참조 제거됨... gc의 수거 대상으로 바뀜...
        // 5만원권 6장
        // 만원권 0장
        // 5천원권 1장
        // 천원권 0장
        // 5백원 0
        // 100원 4개
        // 5십원 1개
        //십원 4개
        //증감 연산자
    }
}

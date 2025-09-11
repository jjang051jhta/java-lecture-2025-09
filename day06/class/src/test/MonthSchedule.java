package test;

import java.util.Scanner;

public class MonthSchedule {
    private Day [] dayList;
    private int total;
    private int select;
    Scanner scanner= new Scanner(System.in);
    //생성자를 통해서 몇개의 해야할 일이 있는지 결정
    MonthSchedule(int total) {
        this.total = total;
        dayList = new Day[total];
        for(int i=0;i<total;i++) {
            dayList[i] = new Day();
        }
        System.out.println("이번달은 "+total+"날이 있습니다.");
    }
    public void input() {
        System.out.println("이번 달은  "+total+"일 까지 있습니다. ");
        System.out.println("일자를 입력하세요 ex) 1 ~ "+total+"중에 하나를 입력하세요.");
        int day = scanner.nextInt();
        System.out.println(day+"일에 해야할 일을 입력하세요.");
        String work = scanner.next();
        day--;
        dayList[day].set(work);
        System.out.println("입력되었습니다.");
    }
    public void view() {
        System.out.println("해야할 일을 보여줍니다.");
        System.out.println("일자를 입력하세요 ex) 1 ~ "+total+"중에 하나를 입력하세요.");
        int day = scanner.nextInt();
        day--;
        dayList[day].show(++day);
    }
    public void finish() {
        System.out.println("종료합니다.");
    }
    public void run() {
        System.out.println("Month Schedule을 실행합니다.");

        while(true) {
            System.out.println("입력 : 1 , 보기 : 2 , 3 : 끝내기 ");
            int num = scanner.nextInt();
            if(num==1) {
                input();
            } else if(num==2) {
                view();
            } else if(num==3) {
                finish();
                return;
            } else {
                System.out.println("잘못 입력하였습니다. ");
            }
        }
    }
}

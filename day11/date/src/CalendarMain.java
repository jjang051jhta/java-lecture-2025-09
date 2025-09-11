import java.util.Calendar;

public class CalendarMain {
    public static void main(String[] args) {
        //추상클래스라서 직접 생성 안됨
        String monthArray[] = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        String days[] = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        System.out.println(year);
        int month = calendar.get(Calendar.MONTH); //일월 정월
        System.out.println(monthArray[month]);
        int date = calendar.get(Calendar.DAY_OF_MONTH); //일월 정월
        System.out.println(date);
        int day = calendar.get(Calendar.DAY_OF_WEEK); //일월 정월
        System.out.println(days[day-1]);
        System.out.println(Calendar.SUNDAY); //1
        System.out.println(Calendar.MONDAY); //2
        //4로 떨어지면 윤년 2024 100으로 떨어지면 윤년아님 400으로 떨어지면 윤년  2000 4
        //G(greenwich) M (mean) T (time)
        //UTC (원자시계 기준)




    }
}

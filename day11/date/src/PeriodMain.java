import java.time.LocalDate;
import java.time.Period;

public class PeriodMain {
    //Period 년월일
    //Duration 시분초
    public static void main(String[] args) {
        Period period = Period.ofDays(10);
        System.out.println(period);
        LocalDate currentDate = LocalDate.of(2030,1,1);
        LocalDate plusDate =  currentDate.plus(period);
        System.out.println("현재 날짜 === "+currentDate);
        System.out.println("더한 날짜 === "+plusDate);
        LocalDate startDate = LocalDate.now();
        LocalDate endDate =  LocalDate.of(2025,12,25);
        Period between = Period.between(startDate,endDate);
        System.out.println(between.getMonths()+"==="+between.getDays());
        //간단 퀴즈
        //생일로부터 현재까지 몇년 몇월 며칠 살았는지 출력
        LocalDate birth = LocalDate.of(2000,12,25);
        System.out.println(birth);
        System.out.println(startDate);
        Period age = Period.between(birth,startDate);
        System.out.println(age.getYears()+"년 "+age.getMonths()+"월 "+age.getDays()+"일 살았습니다.");
        System.out.println(age.toTotalMonths());



    }
}

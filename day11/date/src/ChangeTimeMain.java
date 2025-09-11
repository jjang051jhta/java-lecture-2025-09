import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeMain {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2025,9,5,12,30,0);
        System.out.println(localDateTime);
        LocalDateTime plus10Year = localDateTime.plus(10, ChronoUnit.YEARS);
        System.out.println(plus10Year);
        LocalDateTime plus20Year = plus10Year.plusYears(10);
        System.out.println(plus20Year);
        Period period = Period.ofYears(10);
        System.out.println(plus20Year.plus(period));

        LocalDateTime change2010 = localDateTime.with(ChronoField.YEAR,2010);
        LocalDateTime changeMonth = localDateTime.with(ChronoField.MONTH_OF_YEAR,3);
        System.out.println(change2010);
        System.out.println(changeMonth);
        //get();
        //plus() minus()
        //with()
        LocalDateTime with01 = localDateTime.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)); //유추가능한것들을 알아서 해준다.
        System.out.println(with01);
        LocalDateTime with02 = localDateTime.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY)); //유추가능한것들을 알아서 해준다.
        System.out.println(with02);

    }
}

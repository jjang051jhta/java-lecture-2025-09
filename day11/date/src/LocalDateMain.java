import java.time.LocalDate;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDate nowDate =  LocalDate.now();
        LocalDate ofDate = LocalDate.of(2025,12,25);
        System.out.println(nowDate);
        System.out.println(ofDate);
        System.out.println("nowDate.getYear() === " +nowDate.getYear());
        System.out.println("nowDate.getMonth() === " +nowDate.getMonth());
        System.out.println("nowDate.getMonthValue() === " +nowDate.getMonthValue());
        System.out.println("nowDate.getDayOfMonth() === " +nowDate.getDayOfMonth());
        System.out.println("nowDate.getDayOfYear() === " +nowDate.getDayOfYear());
        System.out.println("nowDate.getDayOfWeek() === " +nowDate.getDayOfWeek());
        System.out.println("nowDate.isLeapYear() === " + nowDate.isLeapYear());
        LocalDate plus10Day = nowDate.plusDays(10);
        System.out.println(plus10Day);
        System.out.println(nowDate);
    }
}

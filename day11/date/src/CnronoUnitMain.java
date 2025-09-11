import java.time.temporal.ChronoUnit;

public class CnronoUnitMain {
    public static void main(String[] args) {
        ChronoUnit[] values = ChronoUnit.values();
        for(ChronoUnit value:values) {
            System.out.println("value : "+value);
        }
        System.out.println("Hours : "+ChronoUnit.HOURS.getDuration().getSeconds());
        System.out.println("DAYS : "+ChronoUnit.DAYS.getDuration().getSeconds());
        System.out.println("DAYS : "+60*60*24);
    }
}

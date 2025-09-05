import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain01 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2025,9,5);
        //2020년01월11일
        System.out.println(localDate);
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        String formattedDate = localDate.format(dateTimeFormatter);
        System.out.println(formattedDate);  //LocalDate를 String으로 바꾸기
        System.out.println("=========================");
        String input =  "2025/09/05 12:30:45";
        LocalDateTime parsedDate=  LocalDateTime.parse(input,DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
        System.out.println(parsedDate);
        //parse는 문자열을 LocalDate또는 LocalDateTime으로 바꾸는걸
    }
}

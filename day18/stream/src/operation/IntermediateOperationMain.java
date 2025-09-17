package operation;

import java.util.Comparator;
import java.util.List;

public class IntermediateOperationMain {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 2, 3, 3, 4, 4, 5, 3, 6, 7, 8, 9, 10);
        //1.filter
        System.out.println("1. filter 짝수만 출력");
        numbers.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
        System.out.println("\n=================================");

        System.out.println("2. map 제곱 출력");
        numbers.stream().map(n -> n * n).forEach(n -> System.out.print(n + " "));
        System.out.println("\n=================================");


        System.out.println("3. 중복제거");
        numbers.stream().distinct().forEach(n -> System.out.print(n + " "));
        System.out.println("\n=================================");

        System.out.println("4. sort() 기본정렬");
        numbers.stream().sorted().forEach(n -> System.out.print(n + " "));
        System.out.println("\n=================================");

        System.out.println("5. sort(Comparator.reverseOrder()) 내림차순 기본정렬");
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(n -> System.out.print(n + " "));
        System.out.println("\n=================================");

        System.out.println("6. 동작확인용 peek()");
        numbers.stream()
                .peek(n -> System.out.print("before : " + n + ","))
                .map(n -> n * n)
                .peek(n -> System.out.print("after : " + n + ","))
                .forEach(n -> System.out.println("최종값 : " + n));
        System.out.println("\n=================================");

        System.out.println("7. limit() 처음 몇 개만 들고오기");
        numbers.stream()
                .distinct()
                .limit(5)
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n=================================");

        System.out.println("8. skip() 처음 몇 개 건너띄기");
        numbers.stream()
                .distinct()
                .skip(5)
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n=================================");

        System.out.println("9. takeWhile() 조건을 만족하는 동안 가져온다.");
        numbers.stream()
                .takeWhile(n -> n < 4) //멈춘다. filter + break
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n=================================");

        System.out.println("10. dropWhile() 조건을 만족하는 동안 가져온다.");
        numbers.stream()
                .dropWhile(n -> n < 5) //5보다 작은 동안 건너띄기
                .forEach(n -> System.out.print(n + " "));
        System.out.println("\n=================================");
    }
}

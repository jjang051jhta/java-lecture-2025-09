package lamda.filter;

import java.util.List;

public class FilterMain05 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //짝수만 필터링
        List<Integer> evenNumbers = GenericFilter.filter(numbers, n -> n % 2 == 0);
        System.out.println(evenNumbers);

        List<String> strings = List.of("A","AAA","ABC","ABCD");
        //2글자 이상인것만
        List<String> resultStrings = GenericFilter.filter(strings, s -> s.length()>=2);
        System.out.println(resultStrings);

        //Stream
    }
}

package lamda.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterMain04 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //짝수만 필터링
        List<Integer> evenNumbers = IntegerFilter.filter(numbers, n -> n % 2 == 0);
        System.out.println(evenNumbers);

        List<Integer> oddNumbers = IntegerFilter.filter(numbers, n -> n % 2 == 1);
        System.out.println(oddNumbers);
    }
}

package lamda.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterMain03 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        //짝수만 필터링
        List<Integer> evenNumbers = filter(numbers, n -> n % 2 == 0);
        System.out.println(evenNumbers);

        List<Integer> oddNumbers = filter(numbers, n -> n % 2 == 1);
        System.out.println(oddNumbers);
    }

    static List<Integer> filter(List<Integer> numbers, Predicate<Integer> predicate) {
        List<Integer> filtered = new ArrayList<>();
        for (Integer number : numbers) {
            boolean result = predicate.test(number);
            if (result) filtered.add(number);
        }
        return filtered;
    }
}

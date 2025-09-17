package lamda.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterMain02 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6,7,8,9,10);
        //짝수만 필터링
        List<Integer> evenNumbers =  filterEvenNumber(numbers);
        System.out.println(evenNumbers);
        List<Integer> oddNumbers =  filterEvenNumber(numbers);
        System.out.println(oddNumbers);

    }
    static List<Integer> filterEvenNumber(List<Integer> numbers) {
        List<Integer> filtered = new ArrayList<>();
        for(Integer number : numbers) {
            boolean result = number%2 == 0;
            if(result) filtered.add(number);
        }
        return filtered;
    }
    static List<Integer> filterOddNumber(List<Integer> numbers) {
        List<Integer> filtered = new ArrayList<>();
        for(Integer number : numbers) {
            boolean result = number%2 == 1;
            if(result) filtered.add(number);
        }
        return filtered;
    }

}

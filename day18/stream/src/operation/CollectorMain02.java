package operation;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorMain02 {
    public static void main(String[] args) {
        List<String> names = List.of("Apple","Avocado",
                                     "Banana","BlueBerry",
                                     "Cherry",
                                     "Melon","Mango"
        );
        Map<String,List<String>> grouped =
                names.stream().collect(Collectors.groupingBy(name->name.substring(0,1)));
        System.out.println(grouped);
        List<Integer> numbers = List.of(1,2,3,4,5,6);
        Map<Boolean,List<Integer>> partioned = numbers.stream()
                .collect(Collectors.partitioningBy(n->n%2==0));
        System.out.println(partioned);
        //1. A로 시작하는 것들과 나머지
        Map<Boolean,List<String>> partionedA = names.stream()
                .collect(Collectors.partitioningBy(n-> n.startsWith("A")));
        System.out.println(partionedA);

    }
}

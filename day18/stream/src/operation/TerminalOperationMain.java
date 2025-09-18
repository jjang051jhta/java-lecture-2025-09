package operation;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class TerminalOperationMain {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 2, 3, 3, 4, 4, 5, 3, 6, 7, 8, 9, 10);
        System.out.println("1. collect List 수집");
        List<Integer> evenNumbers = numbers.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
        System.out.println("짝수 리스트 : "+evenNumbers);
        evenNumbers.add(100); //가변객체 mutable
        System.out.println("=============================");

        System.out.println("2. toList 수집");
        List<Integer> evenNumbers02 = numbers.stream().filter(n -> n%2 == 0).toList();  //16버전 이상
        System.out.println("짝수 리스트 : "+evenNumbers02);
        //evenNumbers02.add(100); immutable
        System.out.println("=============================");

        System.out.println("3. toArray 배열로 반환");
        Integer [] evenNumbers03 = numbers.stream().filter(n -> n%2 == 0).toArray(Integer[]::new);  //16버전 이상
        System.out.println("짝수 배열 : "+ Arrays.toString(evenNumbers03));
        System.out.println("=============================");

        System.out.println("4. forEach 각 요소 처리");
        numbers.stream().filter(n -> n%2 == 0).forEach(n-> System.out.print(n+" "));
        System.out.println("\n=============================");

        System.out.println("5. count - 갯수 처리");
        long count = numbers.stream().filter(n -> n > 5).count();
        System.out.println("5보다 큰 숫자의 갯수 = "+count);
        System.out.println("\n=============================");

        System.out.println("6. reduce 요소들의 합");
        Optional<Integer> sum01 = numbers.stream().reduce((a, b) -> a+b);
        System.out.println("각 요소들의 합 초기값 없음 = "+sum01.orElse(0)); //Optional은 null체크용
        System.out.println("\n=============================");

        System.out.println("6-2. reduce 요소들의 합");
        int sum02 = numbers.stream().reduce(100,(a, b) -> a+b);
        System.out.println("각 요소들의 합 초기값 없음 = "+sum02); //Optional은 null체크용
        System.out.println("\n=============================");

        System.out.println("6-3. reduce 요소들의 합");
        List<Integer> emptyNumbers = List.of();

        Optional<Integer> sum03 = emptyNumbers.stream().reduce((a, b) -> a+b);
        System.out.println("각 요소들의 합 초기값 없음 = "+sum03.orElse(0)); //Optional은 null체크용
        if(sum03.isPresent()) {
            System.out.println(sum03.get());
        } else {
            System.out.println(0);
        }
        System.out.println("\n=============================");

        System.out.println("7.  min 최소값");
        //Optional<Integer> min  = numbers.stream().min(Integer::compareTo);
        /*
        Optional<Integer> min  = numbers.stream().min(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        Optional<Integer> min  = numbers.stream().min(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
         */
        Optional<Integer> min  = numbers.stream().min((o1, o2) -> o1.compareTo(o2));
        System.out.println("제일 작은 수 = "+min.get());
        System.out.println("\n=============================");

        System.out.println("8.  max 최대값");
        //Optional<Integer> max  = numbers.stream().max(Integer::compareTo);
        /*
        Optional<Integer> max  = numbers.stream().max(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        Optional<Integer> max  = numbers.stream().max(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
         */
        Optional<Integer> max  = numbers.stream().max((o1, o2) -> o1.compareTo(o2));
        System.out.println("제일 작은 수 = "+max.get());
        System.out.println("\n=============================");



        System.out.println("8. findFirst 첫번째 요소 찾기");
        Integer first = numbers.stream().filter(n -> n > 5).findFirst().get();
        System.out.println("findFirst 첫번째 요소 찾기 = "+first);
        System.out.println("\n=============================");

        System.out.println("9. findAny 아무 요소 찾기");
        Integer any = numbers.stream().filter(n -> n > 5).findAny().get();  //병렬로 찾는다
        System.out.println("findFirst 아무 요소 찾기 = "+any);
        System.out.println("\n=============================");


        System.out.println("10. anyMatch  조건을 충족하는게 하나라도 있으면 ");
        boolean anyMatch = numbers.stream().anyMatch(n -> n > 1000);  //병렬로 찾는다
        System.out.println("anyMatch 조건을 충족하는게 하나라도 있으면 = "+anyMatch);
        System.out.println("\n=============================");


        System.out.println("11. allMatch  조건을 충족하는게 하나라도 있으면 ");
        boolean allMatch = numbers.stream().allMatch(n -> n > 2);  //병렬로 찾는다
        System.out.println("allMatch 조건을 전부 충족하느냐 = "+allMatch);
        System.out.println("\n=============================");

        System.out.println("12. noneMatch  조건을 충족하는게 없으면 ");
        boolean noneMatch = numbers.stream().noneMatch(n -> n < 0);  //병렬로 찾는다
        System.out.println("noneMatch 조건을 전부 충족하느냐 = "+noneMatch);
        System.out.println("\n=============================");
    }
}

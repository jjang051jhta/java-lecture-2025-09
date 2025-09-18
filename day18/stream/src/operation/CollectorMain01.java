package operation;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorMain01 {
    public static void main(String[] args) {
        List<String> list = Stream.of("Java","Spring","JPA","AOP")
                            .collect(Collectors.toList()); //가변
        System.out.println("list = "+list);
        list.add("MYBATIS");
        System.out.println("list = "+list);
        List<Integer> unmodifiableList = Stream.of(1,2,3,4,5)
                .collect(Collectors.toUnmodifiableList());
        //unmodifiableList.add(4);

        List<Integer> unmodifiableList02 = Stream.of(1,2,3,4,5)
                .toList(); //불변으로 반환
        //unmodifiableList02.add(4);

        Set<Integer> integerSet = Stream.of(5,7,4,3,1,2,2,3,3,4,5).collect(Collectors.toSet());
        System.out.println(integerSet); //set 기본 정렬 해서 넘겨준다.  Hashset

        Set<Integer> integerSet02 = Stream.of(5,7,4,3,1,2,2,3,3,4,5)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println(integerSet02);  //treeset은 정렬해서 넘겨준다.

        Set<Integer> integerSet03 = Stream.of(5,7,4,3,1,2,2,3,3,4,5)
                .collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(integerSet03);  //입력 순서래도 돌려준다.

        Map<String,Integer> map01 = Stream.of("Apple","Apple","Banana","Tomato")
                .collect(Collectors.toMap(
                        name -> name,
                        name->name.length(),
                        (oldVal,newVal) -> oldVal
                ));
        System.out.println(map01);
        //DB에서 처리 가능한 것들은 db에서 하는게 제일 빠르다.
    }
}

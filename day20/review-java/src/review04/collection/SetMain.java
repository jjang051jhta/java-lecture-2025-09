package review04.collection;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class SetMain {
    public static void main(String[] args) {
        Set<String> set = new HashSet();
        set.add("A");
        set.add("A");
        set.add("A");
        set.add("A");
        set.add("A");
        set.add("B");
        set.add("B");
        set.add("B");
        set.add("B");
        set.add("C");
        set.add("C");
        set.add("C");
        set.add("C");
        System.out.println(set);
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        for(String str:set) {
            System.out.println(str);
        }
        set.forEach(System.out::println);
        //{30,20,20,10,10}  set으로 만들어보자... 10,20,30
        //{30,20,20,10,10}  입력순서데로 나오게도 해보자 30,20,10
        Integer [] intArr = {30,20,20,10,10};
        Set<Integer> set01 = new HashSet<>(Arrays.asList(intArr));
        System.out.println(set01);



        Set<Integer> set02 = new LinkedHashSet<>(Arrays.asList(intArr));
        System.out.println(set02);

        Set<Integer> set03 = new TreeSet<>(Arrays.asList(intArr));
        System.out.println(set03);



        Set<Integer> set04 = Arrays.stream(intArr).collect(Collectors.toSet());
        System.out.println(set04);



    }
}

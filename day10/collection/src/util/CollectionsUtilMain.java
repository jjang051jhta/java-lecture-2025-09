package util;

import java.util.*;

public class CollectionsUtilMain {
    public static void main(String[] args) {
        //Collection은 매우매우 중요...
        //ArrayList / HashMap / HashSet
        //뇌리에 박힌다.
        List<Integer> list = List.of(1, 2, 3);
        Set<Integer> set = Set.of(1, 2, 3);
        Map<Integer, String> map = Map.of(1,"one",2,"two");
        //불변객체로 만들어짐
        System.out.println(list);
        System.out.println(list.getClass());
        System.out.println(set);
        System.out.println(set.getClass());
        System.out.println(map);
        System.out.println(map.getClass());
        ArrayList<Integer> mutableList =  new ArrayList<>(list);
        mutableList.add(4);
        System.out.println(mutableList);
        System.out.println(mutableList.getClass());
        List<Integer> unmodifiedList = Collections.unmodifiableList(mutableList);
        unmodifiedList.add(5);

    }
}

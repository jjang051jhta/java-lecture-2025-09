package iter;

import java.util.*;

public class IterableMain {
    public static void printAll(Iterator<Integer> iterator) {
        System.out.println("iterator = "+iterator.getClass());
        while(iterator.hasNext()) {
            System.out.print(iterator.next()+" / ");
        }
    }
    public static void foreach(Iterable<Integer> iterable) {
        System.out.println("iterable = "+iterable.getClass());
        for(Integer i : iterable) {
            System.out.print (i +" / ");
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        printAll(list.iterator());
        foreach(list);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        printAll(list.iterator());
        foreach(set);
    }

}

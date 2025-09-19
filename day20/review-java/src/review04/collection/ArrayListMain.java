package review04.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {
        //array
        List<String> animals = new ArrayList<>();
        animals.add("고양이");
        animals.add("멍멍이");
        animals.add("짹짹이");
        System.out.println(animals.get(0));
        System.out.println(animals.get(1));
        System.out.println(animals.get(2));
        System.out.println("=============");
        System.out.println(animals.remove(1));
        System.out.println("1번제거");
        System.out.println(animals.get(0));
        System.out.println(animals.get(1));
        System.out.println(animals.size());
        System.out.println(animals.contains("멍멍이"));
        //animals.clear();
        String [] fruitArr = {"apple","banana","peach","plum"};
        List<String> fruitList = new ArrayList<>(Arrays.asList(fruitArr));
        List<String> fruitList02 = List.of("apple","banana","peach","plum");
        System.out.println(fruitList);
        System.out.println(fruitList02);
        Iterator<String> iterator = fruitList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

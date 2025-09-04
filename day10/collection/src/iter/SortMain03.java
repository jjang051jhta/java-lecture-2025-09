package iter;

import java.util.Set;
import java.util.TreeSet;

public class SortMain03 {
    public static void main(String[] args) {
        User user01 = new User("aaa",30);
        User user02 = new User("bbb",40);
        User user03 = new User("ccc",10);
        Set<User> treeSet01 = new TreeSet<>(); //
        treeSet01.add(user01);
        treeSet01.add(user02);
        treeSet01.add(user03);
        System.out.println("Comparable 기본 정렬");
        System.out.println(treeSet01);


        Set<User> treeSet02 = new TreeSet<>(new IdComparator()); //
        treeSet02.add(user01);
        treeSet02.add(user02);
        treeSet02.add(user03);
        System.out.println("Id 정렬");
        System.out.println(treeSet02);
        //TreeSet을 만들때는 반드시 정렬 구현이 필요하다.

    }
}

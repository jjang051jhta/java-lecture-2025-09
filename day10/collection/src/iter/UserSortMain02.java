package iter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class UserSortMain02 {
    public static void main(String[] args) {
        User user01 = new User("aaa",30);
        User user02 = new User("bbb",40);
        User user03 = new User("ccc",10);

        List<User> userList = new ArrayList<>();
        userList.add(user01);
        userList.add(user02);
        userList.add(user03);
        System.out.println("기본정렬");
        System.out.println(userList);
        System.out.println("Comparable 기본 정렬");
        userList.sort(null);
        //Collections.sort(userList);
        System.out.println(userList);
        System.out.println("Id  정렬");
        userList.sort(new IdComparator());
        //Collections.sort(userList, new IdComparator());
        System.out.println(userList);


    }
}

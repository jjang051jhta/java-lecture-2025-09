package iter;

import java.util.Arrays;

public class UserSortMain {
    public static void main(String[] args) {
        User user01 = new User("aaa",30);
        User user02 = new User("bbb",40);
        User user03 = new User("ccc",10);

        User users[] =  {user01,user02,user03};
        System.out.println(Arrays.toString(users));
        Arrays.sort(users);
        System.out.println(Arrays.toString(users));
        System.out.println("Id정렬");
        Arrays.sort(users,new IdComparator().reversed());
        System.out.println(Arrays.toString(users));
    }
}

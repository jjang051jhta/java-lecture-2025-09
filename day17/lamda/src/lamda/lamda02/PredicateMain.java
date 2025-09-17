package lamda.lamda02;

import java.util.function.Predicate;

public class PredicateMain {
    //입력(o) 반환(boolean)
    public static void main(String[] args) {
        Predicate<Integer> predicate01 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer%2==0;
            }
        };
        System.out.println(predicate01.test(3));

        Predicate<Integer> predicate02 = integer -> integer%2 ==0;
        System.out.println(predicate02.test(5));
    }


}

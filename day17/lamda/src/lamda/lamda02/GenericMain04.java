package lamda.lamda02;

import java.util.function.Function;

public class GenericMain04 {
    public static void main(String[] args) {
        //Function 매개변수 1, 리턴타입이 있다.
        Function<String, String> upperCase = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        };
        String result01 = upperCase.apply("hello");
        System.out.println("reault01 = "+result01);

        Function<Integer,Integer> square = integer -> integer*integer;
        Integer result02 = square.apply(3);
        System.out.println("result02 = "+result02);
        /*
        Function:입력(o), 반환(o);
        Consumer:입력(o), 반환(x);
        Supplier:입력(x), 반환(o);
        Runnable:입력(x), 반환(x);
         */
    }
}

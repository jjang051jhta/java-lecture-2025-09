package lamda.lamda02;

public class GenericMain03 {
    public static void main(String[] args) {
        GenericFunction<String, String> upperCase = new GenericFunction<String, String>() {
            @Override
            public String apply(String s) {
                return s.toUpperCase();
            }
        };
        String result01 = upperCase.apply("hello");
        System.out.println("reault01 = "+result01);

        GenericFunction<Integer, Integer> square = new GenericFunction<Integer, Integer>() {
            @Override
            public Integer apply(Integer s) {
                return s*s;
            }
        };
        Integer result02 = square.apply(3);
        System.out.println("reault02 = "+result02);

        GenericFunction<Integer,Boolean> isEven = num -> num%2==0;
        Boolean result03 = isEven.apply(3);
        System.out.println("result03 = "+result03);
    }
    //전세계 모든 개발자들이 함수형 인터페이스를 만들어서 사용해야 한다.
    @FunctionalInterface
    interface GenericFunction<T, R> {
        R apply(T s);
    }
}

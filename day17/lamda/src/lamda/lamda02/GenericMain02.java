package lamda.lamda02;

public class GenericMain02 {
    public static void main(String[] args) {
        ObjectFunction upperCase  = (s) -> ((String)s).toUpperCase();
        String result01 =  (String) upperCase.apply("hello");
        System.out.println("result01 = "+result01);

        ObjectFunction square = (n) -> (Integer)n * (Integer)n;
        Integer result02 = (Integer) square.apply(3);
        System.out.println("result02 = "+result02);

        //매개변수 Integer, String 그리고 리턴타입이 Integer, String
    }
    @FunctionalInterface
    interface ObjectFunction {
        Object apply(Object s);
    }

}

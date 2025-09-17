package lamda.lamda02;

public class GenericMain01 {
    public static void main(String[] args) {
        StringFunction upperCase  = (s) -> s.toUpperCase();
        String result01 =  upperCase.apply("hello");
        System.out.println("result01 = "+result01);

        NumberFunction square = (n) -> n*n;
        Integer result02 = square.apply(3);
        System.out.println("result02 = "+result02);

        //매개변수 Integer, String 그리고 리턴타입이 Integer, String
    }
    @FunctionalInterface
    interface StringFunction {
        String apply(String s);
    }

    @FunctionalInterface
    interface NumberFunction {
        Integer apply(Integer s);
    }
}

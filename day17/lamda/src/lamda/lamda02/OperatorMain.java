package lamda.lamda02;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class OperatorMain {
    public static void main(String[] args) {
        Function<Integer, Integer> square01 = x -> x * x;
        UnaryOperator<Integer> square02 = x -> x * x;
        System.out.println(square01.apply(10));
        System.out.println(square02.apply(5));

        BiFunction<Integer, Integer, Integer> add01 = (a, b) -> a + b;
        System.out.println(add01.apply(10, 10));
        BinaryOperator<Integer> add02 = (a, b) -> a + b;
        System.out.println(add02.apply(5, 5));
    }
}

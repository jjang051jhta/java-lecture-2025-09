package lamda.lamda02;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;

public class BiMain {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> add01 = (a, b) -> a + b;

        System.out.println(add01.apply(10, 10));
        BinaryOperator<Integer> add02 = (a, b) -> a + b;
        System.out.println(add02.apply(10, 10));
        BiConsumer<String, Integer> repeat = (c, n) -> {
            for (int i = 0; i < n; i++) {
                System.out.print(c + " ");
            }
            System.out.println();
        };
        repeat.accept("*", 10);
        BiPredicate<Integer, Integer> isGreater = (a, b) -> a > b;
        System.out.println(isGreater.test(10,5));
    }
}

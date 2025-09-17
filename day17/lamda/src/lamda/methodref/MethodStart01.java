package lamda.methodref;

import java.util.function.BinaryOperator;

public class MethodStart01 {
    public static void main(String[] args) {
        BinaryOperator<Integer> add01 = (x,y) -> x+y;
        BinaryOperator<Integer> add02 = (x,y) -> x+y;

        Integer result01 = add01.apply(1,2);
        System.out.println("result01 = "+result01);
        Integer result02 = add01.apply(1,2);
        System.out.println("result02 = "+result02);

    }
}

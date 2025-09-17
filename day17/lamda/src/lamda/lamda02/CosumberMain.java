package lamda.lamda02;

import java.util.function.Consumer;

public class CosumberMain {
    public static void main(String[] args) {
        Consumer<String> consumer01 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer01.accept("hello lamda");

        Consumer<String> consumer02 =(s) -> System.out.println(s);

        consumer02.accept("hello lamda consumer");
    }

}

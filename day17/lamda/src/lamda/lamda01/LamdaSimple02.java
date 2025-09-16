package lamda.lamda01;

import lamda.MyFunction;
import lamda.Procedure;

public class LamdaSimple02 {
    public static void main(String[] args) {
        Procedure procedure = new Procedure() {
            @Override
            public void run() {
                System.out.println("hello lamda~~~~");
            }
        };
        procedure.run();
        Procedure procedure02 = () -> {
            System.out.println("hello lamda~~~~");
        };
        procedure02.run();

        Procedure procedure03 = () -> System.out.println("hello lamda~~~~");
        procedure03.run();

    }
}

package lamda.lamda01;

import lamda.Procedure;

public class ProcedureMain02 {
    public static void main(String[] args) {
        Procedure procedure = () -> {
                System.out.println("hello!! lamda");
        };
        procedure.run();
    }
}

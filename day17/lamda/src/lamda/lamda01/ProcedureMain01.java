package lamda.lamda01;

import lamda.Procedure;

public class ProcedureMain01 {
    public static void main(String[] args) {
        Procedure procedure=new Procedure() {
            @Override
            public void run() {
                System.out.println("hello!! lamda");
            }
        };
        procedure.run();
    }
}

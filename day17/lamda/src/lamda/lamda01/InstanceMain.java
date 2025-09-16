package lamda.lamda01;

import lamda.Procedure;

public class InstanceMain {
    public static void main(String[] args) {
        Procedure procedure = new Procedure() {
            @Override
            public void run() {
                System.out.println("hello!! lamda");
            }
        };
        System.out.println("class.class = "+procedure.getClass());
        System.out.println("class.instance = "+procedure);
        System.out.println("=====================");
        Procedure procedure02 = () ->{
            System.out.println("hello!! lamda");
        };
        System.out.println("lamda.class = "+procedure02.getClass());
        System.out.println("lamda.instance = "+procedure02);
    }
}

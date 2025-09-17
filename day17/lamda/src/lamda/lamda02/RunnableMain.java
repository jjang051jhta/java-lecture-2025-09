package lamda.lamda02;

public class RunnableMain {
    public static void main(String[] args) {
        Runnable runnable01 = new Runnable() {
            @Override
            public void run() {
                System.out.println("run run run");
            }
        };
        runnable01.run();

        Runnable runnable02 = () -> System.out.println("run run run");
        runnable02.run();
    }
}

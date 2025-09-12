package thread01;

public class HelloRunnableMain {
    public static void main(String[] args) {
        //main()스레드가 생성된다.
        System.out.println(Thread.currentThread().getName()+" : main() start");
        HelloRunnable helloRunnable = new HelloRunnable();
        Thread thread = new Thread(helloRunnable);
        thread.start();
        System.out.println(Thread.currentThread().getName()+" : main() end");
    }
}

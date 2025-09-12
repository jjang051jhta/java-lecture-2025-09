package thread01;

public class HelloThreadMain {
    public static void main(String[] args) {
        //메인은 자동으로 생성되어 호출된다.
        System.out.println(Thread.currentThread().getName()+" : main() start");
        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName()+" : start() 호출전");
        helloThread.start();
        System.out.println(Thread.currentThread().getName()+" : start() 호출후");
        System.out.println(Thread.currentThread().getName()+" : main() end");
    }
}

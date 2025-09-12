package thread01;

import utils.MyLogger;

public class HelloThreadMain02 {
    public static void main(String[] args) {
        //main()도 스레드다.
        MyLogger.log("main() start");
        HelloRunnable helloRunnable = new HelloRunnable();
//        Thread thread01 = new Thread(helloRunnable);
//        thread01.start();
//        Thread thread02 = new Thread(helloRunnable);
//        thread02.start();
//        Thread thread03 = new Thread(helloRunnable);
//        thread03.start();
        for(int i=0;i<100;i++) {
            Thread thread = new Thread(helloRunnable);
            thread.start();
        }
        //스레드는 순서 보장 없다. context switching이 일어난다.
        MyLogger.log("main() end");
    }
}

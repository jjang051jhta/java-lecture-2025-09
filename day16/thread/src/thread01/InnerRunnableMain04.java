package thread01;

import utils.MyLogger;

public class InnerRunnableMain04 {
    public static void main(String[] args) {
        MyLogger.log("main() start");
        //익명 클래스
        /*
        class MyRunnable implements Runnable {

            @Override
            public void run() {
                MyLogger.log("run()");
            }
        }
         */
        //1회용
        // 람다식
        Thread thread = new Thread(() -> MyLogger.log("run()"));
        thread.start();
        MyLogger.log("main() end");
    }

}

package thread01;

import utils.MyLogger;

public class InnerRunnableMain02 {
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
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                MyLogger.log("run()");
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
        MyLogger.log("main() end");
    }

}

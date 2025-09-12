package thread01;

import utils.MyLogger;

public class InnerRunnableMain03 {
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
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                MyLogger.log("run()");
            }
        });
        thread.start();
        MyLogger.log("main() end");
    }

}

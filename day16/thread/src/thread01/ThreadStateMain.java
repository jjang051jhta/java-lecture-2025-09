package thread01;

import utils.MyLogger;

public class ThreadStateMain {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunnable(),"myThread");
        MyLogger.log("myThread.state01 = "+thread.getState()); //new
        MyLogger.log("myThread.start()");
        thread.start();
        Thread.sleep(1000);
        MyLogger.log("myThread.state03 = "+thread.getState());
        Thread.sleep(4000);
        MyLogger.log("myThread.state05 = "+thread.getState());
        MyLogger.log("end");
    }
    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            try {
            MyLogger.log("start");
            MyLogger.log("myThread.state02 = "+Thread.currentThread().getState());
            MyLogger.log("sleep() start");
            Thread.sleep(3000);
            MyLogger.log("sleep() end");
            MyLogger.log("myThread.state02 = "+Thread.currentThread().getState());
            MyLogger.log("end");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

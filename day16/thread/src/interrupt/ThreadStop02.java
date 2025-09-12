package interrupt;
import static utils.MyLogger.log;
import static utils.ThreadUtil.sleep;

public class ThreadStop02 {
    //스레드 종료
    public static void main(String[] args) {
        MyTask myTask = new MyTask();
        Thread thread = new Thread(myTask,"work");
        thread.start();
        sleep(4000);
        log("작엄중단 지시 thread.interrupt()"); //방해하다 끼어들다 가로막다
        thread.interrupt(); //가로막은 상태
        log("wokr 스레드의 인터럽트 상태 1 = "+thread.isInterrupted()); //방해하다 끼어들다 가로막다
        //myTask.runFlag = false;
    }
    static class MyTask implements Runnable {
        @Override
        public void run() {
            try {
                while (true) {
                    //체크가 안된다.
                    log("작업중");
                    Thread.sleep(3000);
                }
            } catch (InterruptedException e) {
                log("wokr 스레드의 인터럽트 상태 2 = "+Thread.currentThread().isInterrupted());
                log("interupt message = "+e.getMessage());
                log("statr = "+Thread.currentThread().getState());
            }
            log("자원정리");
            log("작업정리");
        }
    }
}

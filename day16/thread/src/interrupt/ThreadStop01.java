package interrupt;
import static utils.MyLogger.log;
import static utils.ThreadUtil.sleep;

public class ThreadStop01 {
    //스레드 종료
    public static void main(String[] args) {
        MyTask myTask = new MyTask();
        Thread thread = new Thread(myTask,"work");
        thread.start();
        sleep(4000);
        log("작엄중단 지시 funFlag = false");
        myTask.runFlag = false;
    }
    static class MyTask implements Runnable {
        boolean runFlag = true;
        @Override
        public void run() {
            while(runFlag) {
                log("작업중");
                sleep(3000);
            }
            log("자원정리");
            log("작업정리");
        }
    }
}

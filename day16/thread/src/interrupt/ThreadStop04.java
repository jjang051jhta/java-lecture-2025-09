package interrupt;
import static utils.MyLogger.log;
import static utils.ThreadUtil.sleep;

public class ThreadStop04 {
    //스레드 종료
    public static void main(String[] args) {
        MyTask myTask = new MyTask();
        Thread thread = new Thread(myTask,"work");
        thread.start();
        sleep(100);
        log("작엄중단 지시 thread.interrupt()"); //방해하다 끼어들다 가로막다
        thread.interrupt(); //가로막은 상태
        log("wokr 스레드의 인터럽트 상태 1 = "+thread.isInterrupted()); //방해하다 끼어들다 가로막다
        //myTask.runFlag = false;
    }
    static class MyTask implements Runnable {
        @Override
        public void run() {
            //상태확인도 하고 상태도 바꿔준다.
            while (!Thread.interrupted()) {
                log("작업중");
            }
            log("wokr 스레드의 인터럽트 상태 2 = "+Thread.currentThread().isInterrupted());
            try {
                log("자원정리 시도");
                Thread.sleep(1000);
                log("자원정리 완료");
            } catch (InterruptedException e) {
                log("자원정리 실페 - 자원정리 중 인터럽트 발생");
                log("wokr 스레드의 인터럽트 상태 3 = "+Thread.currentThread().isInterrupted());
            }
            log("작업 종료");
        }
    }
}

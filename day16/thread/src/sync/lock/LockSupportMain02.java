package sync.lock;
import java.util.concurrent.locks.LockSupport;

import static utils.MyLogger.log;
import static utils.ThreadUtil.sleep;

public class LockSupportMain02 {
    public static void main(String[] args) {
        Thread thread01 = new Thread(new ParkTask(),"Thread-01");
        thread01.start();
        sleep(100);
        log("Thread-01 state : "+thread01.getState());
    }
    static class ParkTask implements Runnable {
        @Override
        public void run() {
            log("park 시작 , 2초 대기");//타임 지정이 가능
            LockSupport.parkNanos(2000_000000); //wating 상태로 들어간다.
            //1초 1000ms 1ms = 1_000_000ns
            //2000_000000
            log("park 종료, state  : "+Thread.currentThread().getState());
            log("인터럽트 상태  : "+Thread.currentThread().isInterrupted());
            //sync의 단점 시간 지정을 할 수 없다.

        }
    }
}

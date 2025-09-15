package volatile01;

//메모리 가시성
// hard  ssd(창고)  메모리(도마)  cpu  cache 메모리
import static utils.MyLogger.log;
import static utils.ThreadUtil.sleep;
public class VolatileMain {
    public static void main(String[] args) {
        MyTask myTask01 = new MyTask();
        Thread thread =  new Thread(myTask01,"work");  // thread 2개가 동작 중이다.  cpu
        log("runFlag = "+myTask01.runFlag);  //runFlag = true
        thread.start();                            //task 시작
        sleep(1000);
        log("runFlag을 false로 시도");        //"runFlag을 false로 시도"
        myTask01.runFlag= false;
        log("runFlag = "+myTask01.runFlag); //runFlag = false
        log("main  종료");                   //task 종료
                                                  //main 종료
    }
    static class MyTask implements Runnable {
        volatile boolean runFlag = true; //cache에 올리지 않고 직접 접근해서 쓴다.
        @Override
        public void run() {
            log("task 시작");
            while (runFlag) {

            }
            log("task 종료");
        }
    }
}

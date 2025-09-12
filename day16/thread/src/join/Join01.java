package join;
import static utils.MyLogger.log;
import static utils.ThreadUtil.sleep;
public class Join01 {
    public static void main(String[] args) {
        log("start");
        Thread thread01 = new Thread(new Job(),"thread01");
        Thread thread02 = new Thread(new Job(),"thread02");
        //특정 작업이 끝나야지만 할 수 있는 일이 있다.
        //  1 ~ 1000 10초  1~500 thread01, 501~1000 thread02
        thread01.start();
        thread02.start();
        log("end");
    }
    static class Job implements Runnable {
        @Override
        public void run() {
            //2초 정도 걸리는 작업을 한다라고 가정
            log("작업시작");
            sleep(2000);
            log("작업완료");
        }
    }
}

package join;
import static utils.MyLogger.log;
import static utils.ThreadUtil.sleep;
public class Join02 {
    public static void main(String[] args) throws InterruptedException {
        log("start");
        SumTask sumTask01 = new SumTask(1,500);
        SumTask sumTask02 = new SumTask(501,1000);
        Thread thread01 = new Thread(sumTask01,"thread01");
        Thread thread02 = new Thread(sumTask02,"thread02");
        thread01.start();
        thread02.start();
        log("join() - main 스레드가 thread01, thread02 종료까지 대기");
        thread01.join();
        thread02.join();
        log("main 스레드 대기 완료");
        log("sumTask01.result = "+sumTask01.result);
        log("sumTask02.result = "+sumTask02.result);
        int sumAll = sumTask01.result+ sumTask02.result;
        log("sumTask01+sumTask02 = "+sumAll);
        log("end");
        //main스레드는 대기를 하지 sumTask01,sumTask02가 2초 걸리는 작업을 기다리지 않는다.
    }
    static class SumTask implements Runnable {
        int startValue;
        int endValue;
        int result;

        public SumTask(int startValue, int endValue) {
            this.startValue = startValue;
            this.endValue = endValue;
        }
        @Override
        public void run() {
            log("작업 시작");
            sleep(2000);
            int sum=0;
            for(int i=startValue; i<=endValue;i++) {
                sum+=i;
            }
            result = sum;
            log("작업완료 result = "+result);
        }
    }
}

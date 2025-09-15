package volatile01;
import static utils.MyLogger.log;
import static utils.ThreadUtil.sleep;
public class VolatileCountMain {
    public static void main(String[] args) {
        MyTask myTask = new MyTask();
        Thread thread = new Thread(myTask,"work");
        thread.start();
        sleep(1000);
        myTask.flag=false;
        log("flag = "+myTask.flag+" , count = "+myTask.count+" in main()");
    }
    static class MyTask implements Runnable {
        //boolean flag = true;
        //long count;  // 모든 스레드에 나의 변수값을 노출하겠다.
                     // 모든 스레드상에서의 전역 변수

        volatile boolean flag = true;
        volatile long count;  //volatile count변수는 일반메모리에 써야 하고 이걸 main에서 읽어야 한다.



        @Override
        public void run() {
            while(flag) {
                count++;
                if(count%100_000_000==0) {
                    log("flag = "+flag+" , count = "+count+" in while()");
                }
            }
            log("flag = "+flag+" , count = "+count+" 종료");
        }
    }
}

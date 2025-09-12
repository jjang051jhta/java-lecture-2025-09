package test;
import static utils.MyLogger.log;
import static utils.ThreadUtil.sleep;
public class JoinTestMain {
    public static void main(String[] args) throws InterruptedException {
        //1. 스레드 3개를 만들어서 순서대로 실행
        //thread01 1
        //thread01 2
        //thread01 3
        Thread thread01 = new Thread(new MyTask(),"thread01");
        Thread thread02 = new Thread(new MyTask(),"thread02");
        Thread thread03 = new Thread(new MyTask(),"thread03");
        //스레드는 독립적으로 동작한다. 여러개의 스레드를 제어할 필요가 있다.
        thread01.start();
        thread01.join();
        thread02.start();
        thread02.join();
        thread03.start();
        thread03.join();
    }
    static class MyTask implements Runnable {
        @Override
        public void run() {
            for(int i=1;i<=10;i++){
                log(i);
                sleep(100);
            }
        }
    }
}


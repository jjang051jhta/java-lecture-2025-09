package printer;

public class YieldMain {
    //thread 100
    public static void main(String[] args) {
        //스케쥴링 큐에 들어간다.
        for(int i=0;i<100;i++) {
            Thread thread = new Thread(new MyRunnable());
            thread.start();
        }
    }
    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            for(int i=0;i<10;i++) {
                System.out.println(Thread.currentThread().getName()+" - "+i);
                //sleep(1);
                //스케쥴링 큐에서 잠시 빠져 나온다.  RUNNABLE -> TIMED_WAITING -> sleep() -> RUNNABLE
                //Thread.yield();  //실행중인 스레드가 자발적으로cpu를 양보한다. 다른 스레드가 실행된다.
                //yield는 스케쥴링큐에서 계속 대기한다. RUNNABLE상태를 유지한다.

            }
        }
    }
}

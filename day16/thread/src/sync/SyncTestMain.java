package sync;

public class SyncTestMain {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10000;i++) {
                    counter.increment();
                }
            }
        };
        Thread thread01 = new Thread(task);
        Thread thread02 = new Thread(task);
        thread01.start();thread02.start();
        thread01.join();thread02.join();
        System.out.println(counter.getCount());
        // synchronized 재수 없으면 무한 대기를 해야 한다.
        // LockSupport
    }
    static class Counter {
        //스레드가 임계영역에 접근할때 lock을 취득해서 처리하도록 만들때 쓴다.
        // 즉 순차적으로 실행해야 하는 곳에 쓰면 된다.
        private int count = 0;
        public synchronized void  increment() {
            count++;
        }
        public synchronized int getCount() {
            return count;
        }
    }
}

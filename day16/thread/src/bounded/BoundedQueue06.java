package bounded;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static utils.MyLogger.log;

public class BoundedQueue06 implements BoundedQueue{
    private BlockingQueue<String> queue;
    public BoundedQueue06(int max) {
        this.queue = new ArrayBlockingQueue<>(max);
    }
    @Override
    public  void put(String data) {
        try {
            queue.put(data);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //condition안에 생산자 스레드랑 소비자 스레드를 같이 넣어둔 상태
    }
    @Override
    public String take() {
        try {
            return queue.take();
        } catch (InterruptedException e) {
            throw  new RuntimeException(e);
        }
    }
    //자바 진영에서 만들어 논거 있음.
    // BlockingQueue 스레드 관점에서 보면 큐가 특정 조건이 만족될떄까지 스레드 작업을 차단

    @Override
    public String toString() {
        return queue.toString();
    }
}

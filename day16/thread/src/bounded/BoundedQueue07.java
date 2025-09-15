package bounded;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import static utils.MyLogger.log;
import static utils.ThreadUtil.sleep;
public class BoundedQueue07 implements BoundedQueue{
    private BlockingQueue<String> queue;
    public BoundedQueue07(int max) {
        this.queue = new ArrayBlockingQueue<>(max);
    }
    @Override
    public  void put(String data) {

        boolean result = queue.offer(data);

        log("저장 시도 결과  = "+result);

        //condition안에 생산자 스레드랑 소비자 스레드를 같이 넣어둔 상태
    }
    @Override
    public String take() {
        return queue.poll();
    }
    //자바 진영에서 만들어 논거 있음.
    // BlockingQueue 스레드 관점에서 보면 큐가 특정 조건이 만족될떄까지 스레드 작업을 차단

    @Override
    public String toString() {
        return queue.toString();
    }
}

package bounded;

import java.util.ArrayDeque;
import java.util.Queue;

import static utils.MyLogger.log;
import static utils.ThreadUtil.sleep;
public class BoundedQueue02 implements BoundedQueue{
    private final Queue<String> queue = new ArrayDeque<>();
    private final int max;
    public BoundedQueue02(int max) {
        this.max = max;
    }
    @Override
    public synchronized void put(String data) {
        while (queue.size()==max){
            log("[put] 큐가 가득참, 생산자 대기");
            sleep(1000);
        }

        queue.offer(data);
    }
    @Override
    public synchronized String take() {
        while (queue.isEmpty()) {
            log("[take] 큐에 데이터 없음, 소비자 대기");
            sleep(1000);
        }
        return queue.poll();
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}

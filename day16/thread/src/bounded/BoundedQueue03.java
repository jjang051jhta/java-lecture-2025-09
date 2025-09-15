package bounded;

import java.util.ArrayDeque;
import java.util.Queue;

import static utils.MyLogger.log;
import static utils.ThreadUtil.sleep;

public class BoundedQueue03 implements BoundedQueue{
    private final Queue<String> queue = new ArrayDeque<>();
    private final int max;
    public BoundedQueue03(int max) {
        this.max = max;
    }
    @Override
    public synchronized void put(String data) {
        while (queue.size()==max){
            log("[put] 큐가 가득참, 생산자 대기");
            try {
                wait(); //RUNNABLE ===> WAITING 락을 반납
                log("[put] 생산자 꺠어남");
            } catch (InterruptedException e) {
                throw new RuntimeException();
            }
        }

        queue.offer(data);
        log("[put] 생산자 데이터 저장, notify() 호출");
        notify(); //
    }
    @Override
    public synchronized String take() {
        while (queue.isEmpty()) {
            log("[take] 큐에 데이터 없음, 소비자 대기");
            try {
                wait();
                log("[take] 소비자 꺠어남");
            } catch (InterruptedException e) {
                throw  new RuntimeException();
            }
        }
        String data = queue.poll();
        log("[take] 소비자 데이터 확득, notify() 호출");
        notify();
        return data;
        //생산자는 생산자만 깨우고 소비자는 소비자만 꺠우는 비효율이 발생한다.

    }

    @Override
    public String toString() {
        return queue.toString();
    }
}

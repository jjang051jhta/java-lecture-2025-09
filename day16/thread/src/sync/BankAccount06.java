package sync;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static utils.MyLogger.log;
import static utils.ThreadUtil.sleep;

public class BankAccount06 implements BankAccount {

    private int balance; //Lock을 사용하면 메모리 가시성 문제가 해결된다.
                         //volatile을 사용하지 않아도 된다.

    private final Lock lock = new ReentrantLock();

    public BankAccount06(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean withdraw(int amount) {
        log("거래 시작 : "+getClass().getSimpleName()); // 이름 출력 BankAccount01  여기는 임계 영역은 아니다.
        //여기서 임계영역 시작
        //lock.lock(); //다른 스레드 들어오지 못하게 lock()을 건다.
        try {
            if(!lock.tryLock(500, TimeUnit.MILLISECONDS)) {
                log("[ 진입실패 ] 이미 처리중인 작업이 있습니다.");
                return false;
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            log("[검증 시작] 출금액 : " + amount + " , 잔액 : " + balance);
            if (balance < amount) {
                log("[검증 실패] 출금액 : " + amount + " , 잔액 : " + balance);
                return false;
            }
            log("[검증 완료] 출금액 : " + amount + " , 잔액 : " + balance);
            sleep(1000);
            balance -= amount;
            log("[출금 완료] 출금액 : " + amount + " , 잔액 : " + balance);
        } finally {
            lock.unlock();
        }
        //임계영역 끝
        log("[거래 완료]");
        return true;
    }

    @Override
    public int getBalance() {
        lock.lock();
        try {
            return balance;
        } finally {
            lock.unlock();
        }
    }
}

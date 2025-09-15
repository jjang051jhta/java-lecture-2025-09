package sync;
import static utils.MyLogger.log;
import static utils.ThreadUtil.sleep;

public class BankAccount03 implements BankAccount {

    volatile private int balance;

    public BankAccount03(int balance) {
        this.balance = balance;
    }

    @Override
    public boolean withdraw(int amount) {
        log("거래 시작 : "+getClass().getSimpleName()); // 이름 출력 BankAccount01  여기는 임계 영역은 아니다.

        //여기서 임계영역 시작
        synchronized (this) {
            log("[검증 시작] 출금액 : " + amount + " , 잔액 : " + balance);
            if (balance < amount) {
                log("[검증 실패] 출금액 : " + amount + " , 잔액 : " + balance);
                return false;
            }
            log("[검증 완료] 출금액 : " + amount + " , 잔액 : " + balance);
            sleep(1000);
            balance -= amount;
            log("[출금 완료] 출금액 : " + amount + " , 잔액 : " + balance);
        }
        //임계영역 끝


        log("[거래 완료]");
        return true;
    }

    @Override
    public synchronized int getBalance() {
        return balance;
    }
}

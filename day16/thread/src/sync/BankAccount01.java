package sync;
import static utils.MyLogger.log;
import static utils.ThreadUtil.sleep;

public class BankAccount01 implements BankAccount {

    volatile private int balance;

    public BankAccount01(int balance) {
        this.balance = balance;
    }
    //동시성 문제는 자주 면접에 나온다.
    //생산자 소비자 문제 자주 물어봄
    // 식당
    // 주방장 요리  데크(버퍼) [ 1, 2, 3 ]
    // 소비자 음식을 가져간다. [ 1, 2, 3 ]
    // 공장에서 물건을 만든다  창고(버퍼) [1,2,3] 에 물건이 가득차면 공장은 놀아야 한다.
    // 소매상은 창고에서 물건을 들고온다.   창고 [] 에 물건이 가득찰때까지 놀아야 한다.
    // producer - consumer problem
    // bounded - buffer problem

    @Override
    public boolean withdraw(int amount) {
        log("거래 시작 : "+getClass().getSimpleName()); // 이름 출력 BankAccount01
        log("[검증 시작] 출금액 : "+amount+" , 잔액 : "+balance);
        if(balance<amount) {
            log("[검증 실패] 출금액 : "+amount+" , 잔액 : "+balance);
            return false;
        }
        log("[검증 완료] 출금액 : "+amount+" , 잔액 : "+balance);
        sleep(1000);
        balance -= amount;
        log("[출금 완료] 출금액 : "+amount+" , 잔액 : "+balance);
        log("[거래 완료]");
        return true;
    }

    @Override
    public int getBalance() {
        return balance;
    }
}

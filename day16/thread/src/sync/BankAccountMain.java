package sync;
import static utils.MyLogger.log;
import static utils.ThreadUtil.sleep;
public class BankAccountMain {
    public static void main(String[] args) throws InterruptedException {
        //BankAccount bankAccount = new BankAccount01(1000); //1000원
        BankAccount bankAccount = new BankAccount02(1000); //1000원
        Thread thread01 = new Thread(new WithdrawTask(bankAccount,800),"t1");
        Thread thread02 = new Thread(new WithdrawTask(bankAccount,800),"t2");
        thread01.start();
        thread02.start();
        sleep(500);
        //공유 자원  balance 잔액  스레드가 공유하는 변수
        //임계 영역 (critical section)
        //여러개의 스레드가 동시에 접근을 하면 데이터 불일치가 일어날 수 있는 코드부분
        log("t1 state : "+ thread01.getState());
        log("t2 state : "+ thread02.getState());
        thread01.join();
        thread02.join();
        log("최종 잔액 : "+bankAccount.getBalance());
    }
}

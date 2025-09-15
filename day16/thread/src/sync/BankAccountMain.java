package sync;
import static utils.MyLogger.log;
import static utils.ThreadUtil.sleep;
public class BankAccountMain {
    public static void main(String[] args) throws InterruptedException {
        BankAccount bankAccount = new BankAccount01(1000); //1000원
        Thread thread01 = new Thread(new WithdrawTask(bankAccount,800),"t1");
        Thread thread02 = new Thread(new WithdrawTask(bankAccount,800),"t2");
        thread01.start();
        thread02.start();
        sleep(500);
        log("t1 state : "+ thread01.getState());
        log("t2 state : "+ thread02.getState());
        thread01.join();
        thread02.join();
        log("최종 잔액 : "+bankAccount.getBalance());
    }
}

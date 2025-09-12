package thread01;

public class HelloThread extends Thread {
    //1번째 방법 Thread를 상속받아서 처리
    @Override
    public void run() {
        //스레드가 실행할 코드를 여기다가 쓴다.
        System.out.println(Thread.currentThread().getName()+" : run()");
    }
}

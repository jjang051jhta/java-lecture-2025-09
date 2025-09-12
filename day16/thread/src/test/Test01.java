package test;

import utils.MyLogger;

/*
다음 요구사항에 맞게 멀티스레드 프로그램을 작성해라.
1.  Thread 클래스를 상속받은  CounterThread라는 스레드 클래스를 만들자.
2. 이 스레드는 1부터 5까지의 숫자를 1초 간격으로 출력해야 한다. 앞서 우리가 만든  log()로 출력
3.  main()메서드에서  CounterThread 스레드 클래스를 만들고 실행해라.
4. 실행 결과를 참고하자.
실행 결과
09:46:23.329 [ Thread-0] value: 1
09:46:24.332 [ Thread-0] value: 2
09:46:25.338 [ Thread-0] value: 3
09:46:26.343 [ Thread-0] value: 4
09:46:27.349 [ Thread-0] value: 5
 */
public class Test01 {
    //Thread.sleep(1000);
    public static void main(String[] args) {
        CounterThread counterThread = new CounterThread();
        counterThread.start();

    }
    //Runnable implements해서 구현
    //익명 클래스로 만들어 보자
    static class CounterThread extends Thread {
        @Override
        public void run() {
            for(int i=1;i<=5;i++) {
                MyLogger.log(i);
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

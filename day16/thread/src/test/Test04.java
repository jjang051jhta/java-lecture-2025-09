package test;

import utils.MyLogger;

//여러 스레드 사용
//Thread-A,Thread-B 두 스레드를 만들어라
//Thread-A는 1초에 한 번씩 "A"를 출력한다.
//Thread-B 는 0.5초에 한 번씩 "B"를 출력한다.
//이 프로그램은 강제 종료할 때 까지 계속 실행된다.
//실행 결과
//10:04:27.000 [ Thread-A] A
//10:04:27.000 [ Thread-B] B
//10:04:27.507 [ Thread-B] B
//10:04:28.006 [ Thread-A] A
//10:04:28.012 [ Thread-B] B
//10:04:28.518 [ Thread-B] B
//10:04:29.011 [ Thread-A] A
//10:04:29.023 [ Thread-B] B
public class Test04 {
    public static void main(String[] args) {
        Runnable runnable01 =  new Runnable() {
            @Override
            public void run() {
                while (true) {
                    MyLogger.log("A");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        Runnable runnable02 =  new Runnable() {
            @Override
            public void run() {
                while (true) {
                    MyLogger.log("B");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        Thread threadAA = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    MyLogger.log("A");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        Thread threadBB = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    MyLogger.log("B");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });

        Thread threadA = new Thread(new PrintThread("A",1000),"Thread-A");
        Thread threadB = new Thread(new PrintThread("B",500),"Thread-B");
        threadA.start();
        threadB.start();
    }
    static class PrintThread implements Runnable {
        private String content;
        private int sleepTime;

        public PrintThread(String content, int sleepTime) {
            this.content = content;
            this.sleepTime = sleepTime;
        }

        @Override
        public void run() {
            while (true) {
                MyLogger.log(content);
                try {
                    Thread.sleep(sleepTime);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}

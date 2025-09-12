package thread01;

import utils.MyLogger;

public class ThreadInfoMain {
    public static void main(String[] args) {
        Thread mainThread = Thread.currentThread();
        MyLogger.log("mainThread = "+mainThread);
        //mainThread.threadId(),mainThread.getName(),mainThread.getPriority(),mainThread.getThreadGroup()
        MyLogger.log("mainThread.threadId() = "+mainThread.threadId());
        MyLogger.log("mainThread.getName() = "+mainThread.getName());
        MyLogger.log("mainThread.getPriority() = "+mainThread.getPriority());
        MyLogger.log("mainThread.getThreadGroup() = "+mainThread.getThreadGroup());
        MyLogger.log("mainThread.getState() = "+mainThread.getState());
        //NEW 스레드가 시작하지 않은 상태
        //RUNNABLE 스레드가 실행중이거나 실행 준비가 된 상태
        //BLOCKED 스레드가 동기화 락을 기다리는 상태
        //WAITING 스레드가 다른 스레드의 작업이 끝나기를 기다리는 상태
        //TIMED_WAITING 일정시간 기다리는 상태
        //TERMINATED 실행 종료된 상태

        Thread thread = new Thread(new HelloRunnable(),"myHelloThread");
        MyLogger.log("thread = "+thread);
        //thread.threadId(),thread.getName(),thread.getPriority(),thread.getThreadGroup()
        MyLogger.log("thread.threadId() = "+thread.threadId());
        MyLogger.log("thread.getName() = "+thread.getName());
        MyLogger.log("thread.getPriority() = "+thread.getPriority());
        MyLogger.log("thread.getThreadGroup() = "+thread.getThreadGroup());
        MyLogger.log("thread.getState() = "+thread.getState());
        //new  runnable(Bl) terminated





    }
}

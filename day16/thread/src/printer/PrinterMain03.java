package printer;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;

import static utils.MyLogger.log;

public class PrinterMain03 {
    public static void main(String[] args) {
        //interrupt() 강제 종료시키는 메서드
        Printer printer = new Printer();
        Thread printerThread = new Thread(printer,"printer");
        printerThread.start();
        Scanner scanner = new Scanner(System.in);
        while(true){
            log("프린터할 문서를 입력하세요. 종료 (q) : ");
            String input =  scanner.nextLine();
            if(input.equals("q")) {
                //printer.work=false;
                printerThread.interrupt(); //즉시 종료
            }
            printer.addJob(input);
        }
    }
    //바로 종료되게끔
    static class Printer implements Runnable {
        //volatile boolean work = true;
        Queue<String> jobQueue = new ConcurrentLinkedQueue<>();
        @Override
        public void run() {
            //스레드 동시성에 안전하다.
            while (!Thread.interrupted()) {
                if(jobQueue.isEmpty()) continue;
                try {
                    String job =  jobQueue.poll();
                    log("출력 시작 : "+job+", 대기중인 문서 : "+jobQueue);
                    Thread.sleep(3000);
                    log("출력 완료 : "+job);
                } catch (InterruptedException e) {
                    log("인터럽트");
                    break;
                }
            }
            log("프린터 종료");
        }
        public void addJob(String input) {
            jobQueue.offer(input);
        }
    }
}

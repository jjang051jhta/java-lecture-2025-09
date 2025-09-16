package lamda.start;

import lamda.Procedure;

import java.util.Random;

public class Ex02Main {
    public static void helloDice() {
        long startNs = System.nanoTime();
        //코드 조각 시작
        int randomValue = new Random().nextInt(6)+1;
        System.out.println("주사위 = "+randomValue);
        long endNs = System.nanoTime();
        System.out.println("실행 시간 : "+(endNs-startNs)+"ns");
    }
    public static void helloSum() {
        long startNs = System.nanoTime();
        //코드 조각 시작
        for(int i=1;i<=10;i++) {
            System.out.println("i="+i);
        }
        long endNs = System.nanoTime();
        System.out.println("실행 시간 : "+(endNs-startNs)+"ns");
    }
    static class Dice implements Procedure {

        @Override
        public void run() {
            int randomValue = new Random().nextInt(6)+1;
            System.out.println("주사위 = "+randomValue);
        }
    }
    static class Sum implements Procedure  {

        @Override
        public void run() {
            for(int i=1;i<=10;i++) {
                System.out.println("i="+i);
            }
        }
    }

    public static void hello(Procedure procedure) {
        long startNs = System.nanoTime();
        //코드 조각 시작
        procedure.run();
        long endNs = System.nanoTime();
        System.out.println("실행 시간 : "+(endNs-startNs)+"ns");
    }

    public static void main(String[] args) {
        //helloDice();
        //helloSum();
        Procedure dice = new Dice();
        Procedure sum = new Sum();
        hello(dice);
        hello(sum);
    }

}

package lamda.start;

import lamda.Procedure;

import java.util.Random;

public class Ex04Main {
    public static void hello(Procedure procedure) {
        long startNs = System.nanoTime();
        //코드 조각 시작
        procedure.run();
        long endNs = System.nanoTime();
        System.out.println("실행 시간 : "+(endNs-startNs)+"ns");
    }

    public static void main(String[] args) {
        //익명클래스
        Procedure dice = new Procedure() {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6)+1;
                System.out.println("주사위 = "+randomValue);
            }
        };
        Procedure sum = new Procedure() {
            @Override
            public void run() {
                for(int i=1;i<=10;i++) {
                    System.out.println("i="+i);
                }
            }
        };
        hello(new Procedure() {
            @Override
            public void run() {
                int randomValue = new Random().nextInt(6)+1;
                System.out.println("주사위 = "+randomValue);
            }
        });
        hello(new Procedure() {
            @Override
            public void run() {
                for(int i=1;i<=10;i++) {
                    System.out.println("i="+i);
                }
            }
        });
        //람다는 코드 블럭을 매개변수로 전달할때 참조값으로 전달해야 하는데
        //new 를 생성도 해야되고 귀찮은 일이다.
        // 그래서 나온게 람다이다. 
        //자바 8 버전 이상에서 람다를 통해 코드 블럭을 전달할 수 있게 되었다
//        hello({
//            for(int i=1;i<=10;i++) {
//                System.out.println("i="+i);
//            }
//        });
        //메서드에 매개변수로 쓸 수 있는 것
        //1. primitive type
        //2, reference type
    }
}

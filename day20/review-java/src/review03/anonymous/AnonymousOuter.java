package review03.anonymous;

import review03.local.Printer;

public class AnonymousOuter {
    private int outInstanceVal =3;
    public void process(int paramVal) {
        int localVal = 1;
        //익명클래스 interface를 구현해서 만든 클래스를 new로 생성해서 사용하는게 아니라
        // 일회용으로 이름없이 사용하는 클래스
        // 익명 클래스는 매개변수로 전달 가능하다.
        // 여기서 발전된게 람다이다.
        Printer printer = new Printer() {
            int value = 0;
            @Override
            public void print() {
                System.out.println("value = "+value);
                System.out.println("localVal = "+localVal);
                System.out.println("paramVal = "+paramVal);
                System.out.println("outInstanceVal = "+outInstanceVal);
            }
        };
        printer.print();
        System.out.println("printer.getClass()==="+printer.getClass());
    }

    public static void main(String[] args) {
        AnonymousOuter main = new AnonymousOuter();
        main.process(2);
    }
}

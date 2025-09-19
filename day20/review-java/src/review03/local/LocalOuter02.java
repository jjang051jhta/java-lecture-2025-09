package review03.local;

public class LocalOuter02 {
    private int outInstanceVal = 3;
    public Printer process(int paramVal) {
        //메서드내에서도 class를 선언해서 쓸 수 있다.
        int localVal = 1;
        class LocalPrinter implements Printer {
            int value=0;
            public void print() {
                System.out.println("value = "+value);
                System.out.println("localVal = "+localVal);
                System.out.println("paramVal = "+paramVal);
                System.out.println("outInstanceVal = "+outInstanceVal);
            }
        }
        LocalPrinter localPrinter = new LocalPrinter();
        // 지역 클래스에서 참조하는 지역 변수는 캡쳐 된다.
        // 캡쳐한 후에는 값을 바꾸 수 없다. 컴파일 오류 난다.
        // process 메서드 실행 후 사라진다. 즉 여기에 사용된 변수들을 참조하는 LocalPrinter 는 두개의 값을 미리 캡쳐해둔다.
        // 그래도 이걸 바꿀 수 없다.
        //localVal = 10;
        //paramVal = 20;
        return localPrinter;
        //localPrinter.printData();
    }

    public static void main(String[] args) {
        LocalOuter02 localOuter01 = new LocalOuter02();
        Printer printer = localOuter01.process(2);
        printer.print();
    }
}

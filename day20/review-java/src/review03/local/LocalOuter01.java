package review03.local;

public class LocalOuter01 {
    private int outInstanceVal = 3;
    public void process(int paramVal) {
        //메서드내에서도 class를 선언해서 쓸 수 있다.
        int localVal = 1;
        class LocalPrinter {
            int value=0;
            public void printData() {
                System.out.println("value = "+value);
                System.out.println("localVal = "+localVal);
                System.out.println("paramVal = "+paramVal);
                System.out.println("outInstanceVal = "+outInstanceVal);
            }
        }
        LocalPrinter localPrinter = new LocalPrinter();
        localPrinter.printData();
    }

    public static void main(String[] args) {
        LocalOuter01 localOuter01 = new LocalOuter01();
        localOuter01.process(2);
    }
}

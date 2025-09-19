package review03.inner;

public class InnerOuter {
    private static  int outClassValue = 3;
    private int outInstaceValue = 2;
    class Inner {
        private int innerInstanceValue=1;
        public void print() {
            System.out.println(innerInstanceValue);
            System.out.println(outInstaceValue);
            System.out.println(InnerOuter.outClassValue);
        }
    }
}

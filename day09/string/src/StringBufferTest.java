public class StringBufferTest {
    public static void main(String[] args) {
        //멀티 스레드 안전정을 보장  synchronized  동기
        StringBuffer stringBuffer = new StringBuffer("This");
        System.out.println(System.identityHashCode(stringBuffer));
        stringBuffer.append(" is Apple");
        System.out.println(System.identityHashCode(stringBuffer));
        System.out.println(stringBuffer);
        stringBuffer.insert(7, " my");
        System.out.println(System.identityHashCode(stringBuffer));
        System.out.println(stringBuffer);
        stringBuffer.replace(8, 10, "your");
        System.out.println(System.identityHashCode(stringBuffer));
        System.out.println(stringBuffer);
        stringBuffer.delete(8, 13);
        System.out.println(System.identityHashCode(stringBuffer));
        System.out.println(stringBuffer);
        stringBuffer.setLength(4);
        System.out.println("==="+stringBuffer);

        String aa = "abcd";
        String bb = "abcd";
        System.out.println(System.identityHashCode(aa));
        System.out.println(System.identityHashCode(bb));
        aa = aa + "efg";
        System.out.println(System.identityHashCode(aa));
    }
}

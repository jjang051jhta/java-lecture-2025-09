package review03.nested;

public class NestedOuterMain {
    public static void main(String[] args) {
        //중첩클래스 정적중첩 클래스
        NestedOuter outer = new NestedOuter();
        NestedOuter.Nested nested = new NestedOuter.Nested();
        nested.print();
    }
}

package ex01;

public class BoxMain02 {
    public static void main(String[] args) {
        ObjectBox integerBox = new ObjectBox();
        integerBox.setObject(10);
        Integer integer = (Integer) integerBox.getObject();
        System.out.println(integer);
    }
}

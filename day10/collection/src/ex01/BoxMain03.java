package ex01;

public class BoxMain03 {
    public static void main(String[] args) {
        //범용 모든 것
        //
        GenericBox<Integer> integerGenericBox =
                new GenericBox<>();
        //추론
        integerGenericBox.setValue(10);
        Integer integer =
                integerGenericBox.getValue();
        System.out.println(integer);

        GenericBox<String> stringGenericBox =
                new GenericBox<>();
        stringGenericBox.setValue("글자");
        String str = stringGenericBox.getValue();
        System.out.println(str);
    }
}

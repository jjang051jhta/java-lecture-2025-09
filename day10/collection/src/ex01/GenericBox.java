package ex01;

public class GenericBox <T> {
    //T에는 반드시 참조타입만 들어올 수 있다.
    //기본 타입은 못들어온다.
    //T 타입
    //K Key
    //N number
    //V value
    //E element
    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

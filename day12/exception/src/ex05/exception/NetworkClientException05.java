package ex05.exception;

public class NetworkClientException05 extends Exception {
    public NetworkClientException05(String message ) {
        super(message);
    }
    //예외도 class extends 로 부모 객체를 상속받을 수 있다.
}

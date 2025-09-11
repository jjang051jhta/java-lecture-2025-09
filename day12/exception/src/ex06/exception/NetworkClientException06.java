package ex06.exception;

public class NetworkClientException06 extends RuntimeException {
    public NetworkClientException06(String message ) {
        super(message);
    }
    //예외도 class extends 로 부모 객체를 상속받을 수 있다.
}

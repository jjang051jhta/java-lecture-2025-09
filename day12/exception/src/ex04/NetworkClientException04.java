package ex04;

public class NetworkClientException04 extends Exception {
    private String errorCode;

    public NetworkClientException04(String errorCode,String message ) {
        super(message);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }
}

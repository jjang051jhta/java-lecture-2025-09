package ex06.exception;

public class ConnectionException06 extends NetworkClientException06 {
    private final String address;

    public ConnectionException06(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}

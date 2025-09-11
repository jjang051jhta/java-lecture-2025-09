package ex05.exception;

public class ConnectionException05 extends NetworkClientException05 {
    private final String address;

    public ConnectionException05(String address, String message) {
        super(message);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
}

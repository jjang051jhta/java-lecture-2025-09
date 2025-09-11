package ex05.exception;

public class SendException05 extends NetworkClientException05 {
    private final String sendData;

    public SendException05(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}

package ex06.exception;

public class SendException06 extends NetworkClientException06 {
    private final String sendData;

    public SendException06(String sendData, String message) {
        super(message);
        this.sendData = sendData;
    }

    public String getSendData() {
        return sendData;
    }
}

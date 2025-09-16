package chatting.client;

public class ClientMain {
    private static final int PORT = 12345;
    public static void main(String[] args) {
        Client client = new Client("localhost",PORT);
        client.start();
    }
}

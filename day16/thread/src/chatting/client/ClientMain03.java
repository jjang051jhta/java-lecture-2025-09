package chatting.client;

import java.io.IOException;

public class ClientMain03 {
    private static final int PORT = 12345;
    public static void main(String[] args) throws IOException {
        Client client = new Client("localhost",PORT);
        client.start();
    }
    // command pattern  디자인 패턴  자바 코드  comman
}

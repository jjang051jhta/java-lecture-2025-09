package network04;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static utils.MyLogger.log;

public class Server04 {
    private static final int PORT = 12346;
    public static void main(String[] args) throws IOException {
        log("서버 시작");
        ServerSocket serverSocket = new ServerSocket(PORT);
        log("서버 소켓 시작 - 리스닝 포트 : "+PORT);
        while(true) {
            Socket socket = serverSocket.accept();
            log("소켓 연결 : "+socket);
            Session04 session04 = new Session04(socket);
            Thread thread = new Thread(session04);
            thread.start();
        }
    }
}

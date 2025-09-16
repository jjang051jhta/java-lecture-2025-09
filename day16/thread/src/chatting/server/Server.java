package chatting.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static utils.MyLogger.log;
public class Server {
    private final int port;
    private ServerSocket serverSocket;
    //Session / SessingManager
    public Server(int port) {
        this.port = port;
    }
    public  void start() throws IOException {
        log("서버 시작 : ");
        serverSocket = new ServerSocket(port);
        log("서버 소켓 시작 - 리스닝 포트 : "+port);
        running();
    }

    private void running() {

        try {
            while (true) {
                Socket socket = serverSocket.accept();
                log("소케 연결 : "+socket);
                Session session = new Session(socket);
                Thread thread = new Thread(session);
                thread.start();
            }
        } catch (IOException e) {
            log(e);
        }
    }
}

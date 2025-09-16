package chatting.server;

import java.io.IOException;
import java.net.ServerSocket;
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
    }
}

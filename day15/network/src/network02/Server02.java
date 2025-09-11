package network02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import static utils.MyLogger.log;

public class Server02 {
    private static final int PORT = 12346;
    public static void main(String[] args) throws IOException {
        log("서버 시작");
        ServerSocket serverSocket = new ServerSocket(PORT);
        log("서버 소켓 시작 - 리스닝 포트 : "+PORT);
        //서버로 클라이언트 접속을 해올거다.
        Socket socket = serverSocket.accept(); //socket을 생성한다.
        log("소켓 연결 : "+socket);
        //데이터 보낸거를 출력
        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());

        while(true) {
            String received = dataInputStream.readUTF();
            log("client ===> server : "+received);
            if(received.equals("exit")) break;
            String toSend =  received+" World !!!";
            dataOutputStream.writeUTF(toSend);
            log("server ===> client : "+toSend);
        }

        dataInputStream.close();
        dataOutputStream.close();
        socket.close();
        serverSocket.close();
    }
}

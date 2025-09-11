package network01;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import static utils.MyLogger.log;
public class Client01 {
    private static final int PORT = 12346;

    //local서버의 ip  domain  localhost
    public static void main(String[] args) throws IOException {
        log("클라이언트 시작");
        Socket socket = new Socket("localhost",PORT);

        DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
        DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
        log("소켓 연결 : "+socket);
        String toSend = "Hello";
        dataOutputStream.writeUTF(toSend);
        log("client ===>  server : "+toSend);

        //서버에서 넘어오 데이터 받기
        String received = dataInputStream.readUTF();
        log("clinet  <=== server : "+received);

        dataInputStream.close();
        dataOutputStream.close();
        socket.close();
    }
}

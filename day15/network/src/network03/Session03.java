package network03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import static utils.MyLogger.log;
public class Session03 implements Runnable {
    private final Socket socket;

    //생성자 주입
    public Session03(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        try {
            DataInputStream dataInputStream = new DataInputStream(socket.getInputStream());
            DataOutputStream dataOutputStream = new DataOutputStream(socket.getOutputStream());
            while(true) {
                String received =  dataInputStream.readUTF();
                log("client ==> server : "+received);
                if(received.equals("exit")) break;
                String toSend = received+ " world !!";
                dataOutputStream.writeUTF(toSend);
                log("client <== server : "+toSend);
            }
            log("연결 종료 : "+socket);
            dataInputStream.close();
            dataOutputStream.close();
            socket.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

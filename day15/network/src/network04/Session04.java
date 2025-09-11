package network04;

import utils.SocketCloseUtil;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

import static utils.MyLogger.log;
public class Session04 implements Runnable {
    private final Socket socket;

    //생성자 주입
    public Session04(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        DataInputStream dataInputStream = null;
        DataOutputStream dataOutputStream = null;
        try {
            dataInputStream = new DataInputStream(socket.getInputStream());
            dataOutputStream = new DataOutputStream(socket.getOutputStream());
            while(true) {
                String received =  dataInputStream.readUTF();
                log("client ==> server : "+received);
                if(received.equals("exit")) break;
                String toSend = received+ " world !!";
                dataOutputStream.writeUTF(toSend);
                log("client <== server : "+toSend);
            }
        } catch (IOException e) {
            log(e);
        } finally {
            SocketCloseUtil.closeAll(socket,dataInputStream,dataOutputStream);
            log("연결 종료 : "+socket);
        }
    }
}

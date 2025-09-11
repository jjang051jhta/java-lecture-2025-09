package ex06;

import ex05.exception.ConnectionException05;
import ex05.exception.SendException05;
import ex06.exception.ConnectionException06;
import ex06.exception.SendException06;

public class NetworkClient05 {
    //주소
    private final String address;
    public boolean connectError;
    public boolean sendError;
    //생성자 주입
    public NetworkClient05(String address) {
        this.address = address;
    }
    public void connect()  {
        if(connectError){
            throw new ConnectionException06(address,address+" 서버 연결 실패");
        }
        System.out.println(address+ " 서버 연결 성공");
    }
    public void send(String data)  {
        if(sendError) {
            throw new SendException06(data, address + " 서버에 데이전 전송 실패 : "+data);
        }
        System.out.println(address+" 서버에 데이터 전송 : "+data);
    }
    public void disconnect() {
        System.out.println(address+ " 서버 연결 해제");
    }
    public void initError(String data) {
        if(data.contains("error01")){
            connectError = true;
        }
        if(data.contains("error02")) {
            sendError = true;
        }
    }
}

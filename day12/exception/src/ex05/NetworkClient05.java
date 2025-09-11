package ex05;

import ex04.NetworkClientException04;
import ex05.exception.ConnectionException05;
import ex05.exception.SendException05;

public class NetworkClient05 {
    //주소
    private final String address;
    public boolean connectError;
    public boolean sendError;
    //생성자 주입
    public NetworkClient05(String address) {
        this.address = address;
    }
    public void connect() throws ConnectionException05 {
        if(connectError){
            throw new ConnectionException05(address,address+" 서버 연결 실패");
        }
        System.out.println(address+ " 서버 연결 성공");
    }
    public void send(String data) throws SendException05 {
        if(sendError) {
            throw new SendException05(data, address + " 서버에 데이전 전송 실패 : "+data);
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
